# Androide_Development_Assignement
PLEASE SIR READ THE WHOLE README FILE

This project is a **Kotlin-based Student Grading Calculator** organized into three main parts located in the master branch . The first part is a 
**console-based application** located in `src/main/kotlin/Main.kt`, which allows users to calculate student grades, 
view results, and manage grading operations through a terminal interface; it can be executed by navigating to the project root and running `gradlew run`. 
The second part of the project will be a **graphical user interface (GUI)** version placed in a  folder called **'Desktop_App_Gui'**, which will be developed using **JavaFX scene builder** to provide a more user-friendly visual interface .on this second versio the user can upload only .xls and .xlxs  files then the App will process it and ask the user the format  to save the file with processed grades "csv,excel or pdf" .For  now all the Backend and frontend logic has been tested individually but as u can see my controllers files are empty so I didnt had the time to orchestrate and merge both  logics u can test the  logics followimng the INSTRUCTIONS ant testing.md file
for the same grading operations such as uploading CSV or Excel files, calculating marks, and exporting results to PDF or Excel. The third part of the repository contains the **class exercises (Session 2 Assignments)** 
located in `Session_2_Assignements.kt`, which demonstrate Kotlin programming concepts used during the course. The project structure therefore includes the Gradle build system (`build.gradle.kts`, `gradlew`), the Kotlin source files in `src/main/kotlin`, a `scripts`
package containing service and database logic, and a local SQLite database file (`studentcalc.db`) used for storing student records. To run the console application, ensure Java and Gradle are installed, open a terminal in the project root directory, and execute `./gradlew run` (Linux/macOS) or `gradlew run` (Windows). 
This will launch the terminal menu where users can select grading operations and interact with the system.

