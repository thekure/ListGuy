plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = "com.kuredev.listguy"
version = "1.0.0"
application {
    mainClass.set("com.kuredev.listguy.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    implementation(projects.shared)
    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    testImplementation(libs.ktor.ktor.server.test.host)
    testImplementation(libs.jetbrains.kotlin.test)
    testImplementation(libs.kotlin.test.junit)
}