plugins {
    kotlin("jvm") version "1.9.20"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.20")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.20")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

java.sourceCompatibility = JavaVersion.VERSION_21

tasks.test {
    useJUnitPlatform()
}
