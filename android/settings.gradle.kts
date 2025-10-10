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

rootProject.name = "m3chat_messenger_app"
include(":app")

// Load the Flutter module automatically
setBinding(bindings)
evaluate(File(settingsDir.parentFile, "flutter_module/.android/include_flutter.groovy"))
