plugins {
    id("android.application")
}

dependencies {
    implementation(libs.junit)
    implementation(libs.androidx.core)
    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.uiTooling)
    implementation(libs.androidx.compose.uiToolingPreview)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.foundationl)
    androidTestImplementation(libs.androidx.espresso)
    androidTestImplementation(libs.androidx.test.junit)
}
