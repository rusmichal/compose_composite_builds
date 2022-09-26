package com.netguru.plugins

object ProjectConfiguration {

    private const val versionMajor = 1
    private const val versionMinor = 0
    private const val versionPatch = 0

    fun getBuildVersionCode() = 1
    fun getBuildVersionName() = "$versionMajor.$versionMinor.$versionPatch"

    val compose = true
    val testOptions = false
    val appId = "com.netguru.compositebuilds"
    val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"


    // the following values need to be defined as soon as the plugin gets applied
    internal val minSdk = 26
    internal val targetSdk = 30
    internal val compileSdkVersion = 33
    internal val buildToolsVersion = "30.0.3"
}
