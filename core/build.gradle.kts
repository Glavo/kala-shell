dependencies {
    val mavenResolverVersion = "1.7.3"
    val jlineVersion = "3.21.0"

    implementation("org.apache.maven.resolver:maven-resolver-impl:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-connector-basic:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-transport-http:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-transport-file:$mavenResolverVersion")

    implementation("org.jline:jline-terminal:$jlineVersion")
    implementation("org.jline:jline-terminal-jna:$jlineVersion")
    implementation("org.jline:jline-reader:$jlineVersion")

    implementation("net.java.dev.jna:jna:5.11.0")

    implementation(project(":api"))
}