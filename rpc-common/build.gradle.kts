plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinPluginSerialization)
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlinx.rpc)
}

dependencies {
    implementation(libs.ktor.server.cio)
    implementation(libs.ktor.server.core.jvm)
    implementation(libs.ktor.server.websockets.jvm)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.rpc.krpc.ktor.server)
    implementation(libs.kotlinx.rpc.krpc.serialization.json)
}

application {
    mainClass.set("org.seraph.ease.common.MainKt")
}