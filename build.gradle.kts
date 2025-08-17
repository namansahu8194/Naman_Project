buildscript {
    val kotlinVersion by extra("2.0.0-Beta4")
    dependencies {

        classpath ("com.google.gms:google-services:4.4.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

    }
    repositories {
        mavenCentral()
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.12.0" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0-Beta4" apply false
    id("com.google.devtools.ksp") version "2.0.0-Beta4-1.0.19" apply false
}