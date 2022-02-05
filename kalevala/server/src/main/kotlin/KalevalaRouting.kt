import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.kalevalaRouting() {
    get("test") {
        call.respondText { "kalevala" }
    }
}