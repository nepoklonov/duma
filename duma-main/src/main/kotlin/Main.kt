import io.ktor.server.engine.*
import io.ktor.server.netty.*

val APPS = mapOf(
    8080 to "0",
    8081 to "1",
    8082 to "2",
)

fun main(args: Array<String>) {
    val env = applicationEngineEnvironment {
        module {
            module()
        }
        APPS.forEach {
            connector {
                port = it.key
            }
        }
    }
    embeddedServer(Netty, env).start(true)
}