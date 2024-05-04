plugins {
    id("java")
}

group = "ru.netology.autojava2"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation("io.rest-assured:rest-assured:5.3.1")
}

tasks.test {
    useJUnitPlatform()
}