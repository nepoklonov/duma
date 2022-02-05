rootProject.name = "duma"

pluginManagement {
    resolutionStrategy {
        repositories {
            gradlePluginPortal()
            mavenCentral()
        }
    }
}

include("duma-main")
include("duma-shared")
include("kalevala:client")
include("kalevala:server")
include("kalevala:shared")
include("kraski:client")
include("kraski:server")
include("kraski:shared")
include("pobeda:client")
include("pobeda:server")
include("pobeda:shared")
