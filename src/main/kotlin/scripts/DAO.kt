package scripts


import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import java.sql.ResultSet

class DAO(){


    fun connect():Connection{
        val url = "jdbc:sqlite:studentcalc.db"

        // Establish connection
       return DriverManager.getConnection(url)

    }

    fun createTableAndRows() {
        val connection= connect()
        val statement: Statement = connection.createStatement()

        statement.execute("""
        CREATE TABLE IF NOT EXISTS Students(
            matricule TEXT NOT NULL PRIMARY KEY,
            fullname TEXT NOT NULL,
            age INTEGER NOT NULL,
            email TEXT NOT NULL
        );
    """.trimIndent())

        statement.execute("""
        CREATE TABLE IF NOT EXISTS Courses(
            course_code TEXT NOT NULL PRIMARY KEY,
            course_name TEXT NOT NULL,
            course_level TEXT NOT NULL,
            course_lecturer TEXT NOT NULL,
            course_semester TEXT NOT NULL
        );
    """.trimIndent())

        statement.execute("""
        CREATE TABLE IF NOT EXISTS Results(
            id INTEGER NOT NULL PRIMARY KEY,
            student_matricule TEXT NOT NULL,
            course_code TEXT NOT NULL,
            course_semester TEXT NOT NULL,
            exam_grade TEXT NOT NULL,
            final_grade TEXT NOT NULL,
            FOREIGN KEY (student_matricule) REFERENCES Students(matricule),
            FOREIGN KEY (course_code) REFERENCES Courses(course_code)
        );
    """.trimIndent())
        println("Tables created successfully.")

    }

    fun getStudentInfo(matricule: String):ResultSet{
        val conn= connect()
        val querry = """
        SELECT * FROM Students WHERE matricule=?
    """.trimIndent()
        val prepstatement =conn.prepareStatement(querry)
        prepstatement.setString(1,matricule)
        val result = prepstatement.executeQuery()
        return result
    }

    fun getCourseResult(course_code: String):ResultSet{
        val conn= connect()
        val querry = """
        SELECT * FROM Courses WHERE course_code=?
    """.trimIndent()
        val prepstatement =conn.prepareStatement(querry)
        prepstatement.setString(1,course_code)
        val result = prepstatement.executeQuery()
        println(result)
        return result


    }

}


