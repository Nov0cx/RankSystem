plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
}

group = "com.nov0cx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    // kotlin
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    // spigot
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")

    implementation(project(":API"))
}
