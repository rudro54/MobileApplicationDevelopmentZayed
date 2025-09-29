plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "edu.miu"
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
    jvmToolchain(24)
}

application {
    mainClass.set("edu.miu.MainKt")
}