pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Master-SDK"
include(":app")
include(":sdk1")
include(":sdk2")
include(":sdk3")
include(":main-sdk")

includeBuild("assembler")
