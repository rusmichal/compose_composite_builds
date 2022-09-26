plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.android.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "android.application"
            implementationClass = "com.netguru.plugins.AndroidAppPlugin"
        }
        register("androidLibrary") {
            id = "android.library"
            implementationClass = "com.netguru.plugins.LibraryAppPlugin"
        }
    }
}
