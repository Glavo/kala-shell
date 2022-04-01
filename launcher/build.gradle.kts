plugins {
    application
}


application {
    mainClass.set("kala.shell.launcher.Main")
}

dependencies {
    implementation(project(":core"))
}