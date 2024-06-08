plugins {
    id("RpLibrary")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    implementation(project(":Domain:External"))
    implementation(project(":Pratik"))
    implementation(libs.androidx.hilt.compose)
}
