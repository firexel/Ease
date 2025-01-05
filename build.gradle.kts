plugins {
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinPluginSerialization) apply false
    alias(libs.plugins.ktor) apply false
    alias(libs.plugins.kotlinx.rpc) apply false
}

group = "org.seraph"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

project.afterEvaluate {
    childProjects.values.forEach {
        it.repositories {
            mavenCentral()
        }
    }
}
