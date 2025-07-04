plugins {
    id("java")
}

group = "by.mf27"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")

    testCompileOnly("org.projectlombok:lombok:1.18.38")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.38")

    implementation("net.bytebuddy:byte-buddy:1.14.10")
    implementation("net.bytebuddy:byte-buddy-agent:1.14.10")
}

tasks.test {
    useJUnitPlatform()
}