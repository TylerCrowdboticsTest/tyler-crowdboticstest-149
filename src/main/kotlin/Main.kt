import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create().apply {
        port(herokuPort)
        enableStaticFiles("/public")
    }.start()

    app.get("/") { it.renderMustache("/public/index.html") }
}

val herokuPort = ProcessBuilder().environment()["PORT"]?.toInt() ?: 7000
