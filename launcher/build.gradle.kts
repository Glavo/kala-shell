plugins {
    application
}


application {
    mainClass.set("kala.shell.launcher.Main")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

dependencies {
    implementation(project(":core"))
}