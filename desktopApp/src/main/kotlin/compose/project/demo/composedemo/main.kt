package compose.project.demo.composedemo

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState(
        size = DpSize(400.dp, 350.dp),
        position = WindowPosition(300.dp, 300.dp)
    )
    Window(
        title = "Local Time App",
        onCloseRequest = ::exitApplication,
        state = state,
        alwaysOnTop = true
    ) {
        App()
    }
}