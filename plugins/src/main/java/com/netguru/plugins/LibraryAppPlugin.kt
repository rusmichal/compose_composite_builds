package com.netguru.plugins

import com.android.build.api.dsl.LibraryExtension
import com.netguru.plugins.config.androidComposeConfig
import com.netguru.plugins.config.compileOptionsConfig
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibraryAppPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.getByType<LibraryExtension>().apply {
                defaultConfig {
                    targetSdk = ProjectConfiguration.targetSdk
                    consumerProguardFiles("proguard-rules.pro")
                }

                compileOptionsConfig(this)
                androidComposeConfig(this)
            }
        }
    }
}
