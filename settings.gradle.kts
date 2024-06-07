pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        includeBuild("gradle")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RpTrainer"
include(":App")
include(":Features:Home")
include(":Data:Core")
include(":Data:Words")
include(":Domain:External")
include(":Domain:Internal")
include(":Libraries:Logger")
include(":Ui:Atoms")
include(":Ui:Molecules")
include(":Ui:Organisms")
include(":Ui:Templates")
include(":Pratik")
