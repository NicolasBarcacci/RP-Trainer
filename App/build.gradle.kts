plugins {
    id("RpApplication")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.rpTrainer"

    defaultConfig {
        applicationId = "fr.meteordesign.rpTrainer"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":Features:Home"))
    implementation(project(":Domain:External"))
    implementation(project(":Domain:Internal"))
    implementation(libs.androidx.activity.compose)
}
