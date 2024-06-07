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
    // Features
    implementation(project(":Features:Home"))
    // Data
    implementation(project(":Data:Core"))
    implementation(project(":Data:Words"))
    // Domain
    implementation(project(":Domain:External"))
    implementation(project(":Domain:Internal"))
    // Libraries
    implementation(project(":Libraries:Logger"))
    // Ui
    implementation(project(":Ui:Molecules"))
    implementation(project(":Ui:Organisms"))
    implementation(project(":Ui:Templates"))
    // Misc
    implementation(project(":Pratik"))

    implementation(libs.androidx.activity.compose)
}
