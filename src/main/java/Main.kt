import io.javalin.Javalin
import io.javalin.plugin.openapi.annotations.ContentType

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)
    app.get("/" ) {ctx -> ctx.result("Test").contentType(ContentType.JSON)}
}