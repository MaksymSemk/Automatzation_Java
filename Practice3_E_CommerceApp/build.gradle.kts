plugins {
    id("java")
    id("com.example.my-binary-plugin")

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(gradleApi())

}

tasks.test {
    useJUnitPlatform()
}
