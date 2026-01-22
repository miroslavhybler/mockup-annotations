@file:Suppress("UnstableApiUsage")

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "com.github.miroslavhybler.mockup-annotations"
version = "1.2.4"

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
                version = "1.2.4"
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