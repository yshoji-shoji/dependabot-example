import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.10"
	id("io.spring.dependency-management") version "1.0.12.RELEASE"
	id("org.jlleitschuh.gradle.ktlint") version "9.2.1"
	id("io.gitlab.arturbosch.detekt") version "1.18.1"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter:2.6.10")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.10")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.10")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.10")
}

detekt {
	buildUponDefaultConfig = true
	allRules = false
	autoCorrect = true
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
