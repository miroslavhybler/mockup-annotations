plugins {
    `kotlin-dsl`
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("org.jetbrains.kotlin.jvm") version "2.0.0" apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false
    id("org.jetbrains.dokka") version "1.8.20" apply false
}

java {
    withSourcesJar()
    withJavadocJar()
}