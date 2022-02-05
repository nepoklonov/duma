plugins {
    kotlin("jvm")
}

dependencies {
    implementation("io.ktor:ktor-server-netty:1.6.7")
    implementation("io.ktor:ktor-html-builder:1.6.7")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.10")
}