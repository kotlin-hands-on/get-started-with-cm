package compose.project.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform