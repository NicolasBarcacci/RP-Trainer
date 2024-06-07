plugins {
    id("RpLibrary")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    implementation(libs.hilt.navigationCompose)
}
