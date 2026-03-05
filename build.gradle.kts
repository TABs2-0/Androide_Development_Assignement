// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
  //  alias(libs.plugins.android.application) apply false aliases are used only for android apps but here we are doing a terminal app
   // alias(libs.plugins.kotlin.compose) apply false
    kotlin("jvm") version "1.9.22"
    application

}


dependencies {
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
}

application {
    mainClass.set("MainKt")
}
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}