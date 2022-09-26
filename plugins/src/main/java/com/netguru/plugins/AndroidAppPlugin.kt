package com.netguru.plugins

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.netguru.plugins.config.androidComposeConfig
import com.netguru.plugins.config.androidConfig
import com.netguru.plugins.config.buildTypeConfig
import com.netguru.plugins.config.compileOptionsConfig
import com.netguru.plugins.config.signingConfig
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidAppPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.getByType<BaseAppModuleExtension>().apply {
                compileSdk = ProjectConfiguration.compileSdkVersion
                namespace = "com.netguru.compositebuilds"

                androidConfig()
                buildTypeConfig()
                compileOptionsConfig(this)
                signingConfig()
                androidComposeConfig(this)
            }
        }
    }
}
