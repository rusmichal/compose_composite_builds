@file:Suppress("UnstableApiUsage")

package com.netguru.plugins.config

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.netguru.plugins.ProjectConfiguration
import com.netguru.plugins.ProjectConfiguration.getBuildVersionCode
import com.netguru.plugins.ProjectConfiguration.getBuildVersionName

internal fun BaseAppModuleExtension.androidConfig() {
    defaultConfig {
        minSdk = ProjectConfiguration.minSdk
        targetSdk = ProjectConfiguration.targetSdk
        versionCode = getBuildVersionCode()
        versionName = getBuildVersionName()
        applicationId = ProjectConfiguration.appId
        testInstrumentationRunner = ProjectConfiguration.testInstrumentationRunner

        proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
        )
    }
}
