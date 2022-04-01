dependencies {
    val mavenResolverVersion = "1.7.3"

    implementation("org.apache.maven.resolver:maven-resolver-impl:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-connector-basic:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-transport-http:$mavenResolverVersion")
    implementation("org.apache.maven.resolver:maven-resolver-transport-file:$mavenResolverVersion")

    implementation("org.jline:jline:3.21.0")
}