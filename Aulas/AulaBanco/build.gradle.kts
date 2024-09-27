// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("org.jetbrains.kotlin.jvm") version "2.0.20" // ou 'kotlin-android', se for um projeto Android
}

extra["room_version"] = "2.5.2"