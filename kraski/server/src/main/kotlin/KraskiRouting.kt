import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.kraskiRouting() {
    get("test") {
        call.respondText { "kraski" }
    }
}