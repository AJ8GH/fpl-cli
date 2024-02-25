plugins {
  id("com.github.johnrengelman.shadow") version "8.1.1"
  id("io.micronaut.application") version "4.3.3"
  id("io.freefair.lombok") version "8.6"
}

version = "0.0.1-SNAPSHOT"
group = "io.github.aj8gh"

repositories {
  mavenLocal()
  mavenCentral()
}

dependencies {
  annotationProcessor("info.picocli:picocli-codegen")
  annotationProcessor("io.micronaut.serde:micronaut-serde-processor")
  implementation("info.picocli:picocli")
  implementation("io.micronaut.picocli:micronaut-picocli")
  implementation("io.micronaut.serde:micronaut-serde-jackson")
  implementation("org.yaml:snakeyaml:2.2")
  implementation("io.micronaut:micronaut-http-client")
  runtimeOnly("ch.qos.logback:logback-classic")
}

application {
  mainClass.set("io.github.aj8gh.fpl.cli.FplCliCommand")
}

java {
  sourceCompatibility = JavaVersion.toVersion("17")
  targetCompatibility = JavaVersion.toVersion("17")
}

micronaut {
  testRuntime("junit5")
  processing {
    incremental(true)
    annotations("io.github.aj8gh.fpl.cli.*")
  }
}
