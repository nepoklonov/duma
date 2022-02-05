import io.ktor.application.*
import io.ktor.html.*
import io.ktor.routing.*
import kotlinx.html.*

@Suppress("unused")
fun Application.module() {
    routing {
        get("{...}") {
            val port = call.request.local.port
            call.respondHtml {
                body {
                    div {
                        id = "react-app"
                        +"Waiting ${APPS[port]}"
                    }
                    script(src = "/client.js") { }
                }
            }
        }
        port(8080){
            kalevalaRouting()
        }
        port(8081) {
            kraskiRouting()
        }
        port(8082){
            pobedaRouting()
        }
    }
}