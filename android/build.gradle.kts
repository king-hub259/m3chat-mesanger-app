allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// ⚠️ Remove or comment out custom build directory overrides for Codemagic
// val newBuildDir: Directory = rootProject.layout.buildDirectory.dir("../../build").get()
// rootProject.layout.buildDirectory.value(newBuildDir)
//
// subprojects {
//     val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
//     project.layout.buildDirectory.value(newSubprojectBuildDir)
// }

subprojects {
    project.evaluationDependsOn(":app")
}

// Standard clean task
tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
