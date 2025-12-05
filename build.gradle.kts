plugins {
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlin.spring) apply false
    alias(libs.plugins.kotlin.jpa) apply false
    alias(libs.plugins.spring.boot) apply false
    java
}

group = "es.unizar.webeng"
version = "2025-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

project(":accounts") {
}

project(":web") {
}
