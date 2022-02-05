import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*


fun Route.pobedaRouting() {
    get("test") {
        call.respondText { "pobeda" }
    }
}