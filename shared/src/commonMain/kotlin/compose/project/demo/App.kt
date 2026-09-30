package compose.project.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.char
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import composedemo.shared.generated.resources.Res
import composedemo.shared.generated.resources.eg
import composedemo.shared.generated.resources.fr
import composedemo.shared.generated.resources.id
import composedemo.shared.generated.resources.jp
import composedemo.shared.generated.resources.mx
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

// The type now also holds a reference to the flag image
data class Country(val name: String, val zone: TimeZone, val image: DrawableResource)

fun currentTimeAt(location: String, zone: TimeZone): String {
    val timeFormat = LocalTime.Format {
        hour()
        char(':')
        minute()
        char(':')
        second()
    }

    val time = Clock.System.now()
    val localTime = time.toLocalDateTime(zone).time

    return "The time in $location is ${localTime.format(timeFormat)}"
}

// Initializes the list with imported Compose Multiplatform resources
// and returns it
fun defaultCountries() = listOf(
    Country("Japan", TimeZone.of("Asia/Tokyo"), Res.drawable.jp),
    Country("France", TimeZone.of("Europe/Paris"), Res.drawable.fr),
    Country("Mexico", TimeZone.of("America/Mexico_City"), Res.drawable.mx),
    Country("Indonesia", TimeZone.of("Asia/Jakarta"), Res.drawable.id),
    Country("Egypt", TimeZone.of("Africa/Cairo"), Res.drawable.eg)
)

@Composable
@Preview
fun App(countries: List<Country> = defaultCountries()) {
    MaterialTheme {
        var showCountries by remember { mutableStateOf(false) }
        var timeAtLocation by remember { mutableStateOf("No location selected") }

        Column(
            modifier = Modifier
                .padding(20.dp)
                .safeContentPadding()
                .fillMaxSize(),
        ) {
            Text(
                timeAtLocation,
                style = TextStyle(fontSize = 20.sp),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
            )
            Row(modifier = Modifier.padding(start = 20.dp, top = 10.dp)) {
                DropdownMenu(
                    expanded = showCountries,
                    onDismissRequest = { showCountries = false }
                ) {
                    countries.forEach { (name, zone, image) ->
                        // Each country is displayed in a 'DropdownMenuItem'
                        // as a flag ('Image()') and a name ('Text()')
                        DropdownMenuItem(
                            text = { Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    // 'painterResource()' supplies the Painter object
                                    // required by 'Image()'
                                    painterResource(image),
                                    modifier = Modifier.size(50.dp).padding(end = 10.dp),
                                    contentDescription = "$name flag"
                                )
                                Text(name)
                            } },
                            onClick = {
                                timeAtLocation = currentTimeAt(name, zone)
                                showCountries = false
                            }
                        )
                    }
                }
            }

            Button(modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                onClick = { showCountries = !showCountries }) {
                Text("Select Location")
            }
        }
    }
}
