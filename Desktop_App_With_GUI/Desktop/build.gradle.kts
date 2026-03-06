// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //  alias(libs.plugins.android.application) apply false aliases are used only for android apps but here we are doing a terminal app
    // alias(libs.plugins.kotlin.compose) apply false
    kotlin("jvm") version "1.9.22"
    application

}


dependencies {

    implementation("org.openjfx:javafx-controls:21:win")
    implementation("org.openjfx:javafx-fxml:21:win")
    implementation("org.openjfx:javafx-base:21:win")
    implementation("org.openjfx:javafx-graphics:21:win")
    implementation("org.apache.poi:poi:5.2.5")
    implementation("org.apache.poi:poi-ooxml:5.2.5")
    implementation("com.github.librepdf:openpdf:1.3.30")
}



application {
    mainClass.set("com.example.MainKt")

}