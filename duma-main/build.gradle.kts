plugins {
    kotlin("jvm")
    id("application")
}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation(project(":kalevala:server"))
    implementation(project(":kraski:server"))
    implementation(project(":pobeda:server"))
    implementation("io.ktor:ktor-server-netty:1.6.7")
    implementation("io.ktor:ktor-html-builder:1.6.7")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.10")
}

tasks.create("clients") {
    dependsOn(
        ":kalevala:client:browserRun",
        ":kraski:client:browserRun",
        ":pobeda:client:browserRun",
    )
}