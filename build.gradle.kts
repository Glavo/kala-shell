plugins {
    id("java")
}

allprojects {
    apply {
        plugin("java")
    }

    group = "org.glavo.kala"
    version = "1.0-SNAPSHOT"

    repositories {
        //mavenCentral()
        maven(url = "https://maven.aliyun.com/repository/public")
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    }

    tasks.withType<JavaCompile> {
        options.release.set(17)
        options.encoding = "UTF-8"
    }

    tasks.withType<Javadoc> {
        options.encoding = "UTF-8"
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}
