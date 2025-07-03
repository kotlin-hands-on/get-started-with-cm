package compose.project.demo.composedemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform