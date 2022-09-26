package com.netguru.plugins.config

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

fun BaseAppModuleExtension.signingConfig() {
    signingConfigs {
        create("staging") {
            /*storeFile = file(configProperty("KEY_STORE_STAGING_PATH"))
            storePassword = configProperty("KEY_STORE_PASSWORD_STAGING")
            keyAlias = configProperty("ALIAS_STAGING")
            keyPassword = configProperty("KEY_PASS_STAGING")*/
        }
        create("prod") {
            /*storeFile = file(configProperty("KEY_STORE_PROD_PATH"))
            storePassword = configProperty("KEY_STORE_PASSWORD_PROD")
            keyAlias = configProperty("ALIAS_PROD")
            keyPassword = configProperty("KEY_PASS_PROD")*/
        }
    }
}
