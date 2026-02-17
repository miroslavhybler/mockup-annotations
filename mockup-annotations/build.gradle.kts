@file:Suppress("UnstableApiUsage")

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "com.github.miroslavhybler.mockup-annotations"
version = "2.0.0-alpha01"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
    withJavadocJar()

}

kotlin {
    jvmToolchain(jdkVersion = 8)
}

dependencies {
    implementation("androidx.annotation:annotation:1.8.2")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components.getByName("kotlin"))
                groupId = "com.github.miroslavhybler"
                artifactId = "mockup-annotations"
                version = "2.0.0-alpha02"
                pom {
                    description.set("Jitpack.io deploy")
                }
            }

        }
        repositories {
            mavenLocal()
        }
    }
}