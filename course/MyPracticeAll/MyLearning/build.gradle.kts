plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "cs473.edu.miu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}
application {
    mainClass.set("cs473.edu.miu.MainKt")
}