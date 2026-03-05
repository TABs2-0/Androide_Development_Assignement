import scripts.DAO
import scripts.StudentService
import kotlin.system.exitProcess
import java.util.Scanner

val services =StudentService()
val dao = DAO()
val scanner = java.util.Scanner(System.`in`)
fun calcGrades(){

    println("please enter the students matricule")
    var matricule = readLine() ?: return
    val isLoggedIn: Boolean = services.login(matricule)

    if (isLoggedIn==true){
        println("enter the ca_mark")
        var ca_mark= readLine()?.toIntOrNull() ?: return
        println("Enter exam mark")
        var exam_mark = readLine()?.toIntOrNull()?:return
        val grade = services.calcGrade( exam_mark, ca_mark)
        println("Final grade: $grade")
    }else{
        println("Login failed. Invalid matricule.")
    }

}
fun viewPrevious(){
    print(" view")

}
fun viewRes(){
    println("Enter the course code of the course in question")
    val course_code= scanner.nextLine()
    dao.getCourseResult(course_code)
}
fun exit(){

}
fun firstMenu(){


    println(
        """=====================================================================
                _____                _____                    _____                    _____                    _____                    _____                _____                            _____                  
          /$$$$$$  /$$$$$$$$ /$$   /$$ /$$$$$$$  /$$$$$$$$ /$$   /$$ /$$$$$$$$        /$$$$$$                           /$$                  /$$$$$$            /$$          
     /$${'$'}__  $$|__  $${'$'}__/| $$  | $$| $${'$'}__  $$| $${'$'}_____/| $$$ | $$|__  $${'$'}__/       /$${'$'}__  $$                         | $$                 /$${'$'}__  $$          | $$          
    | $$  \__/   | $$   | $$  | $$| $$  \ $$| $$      | $$$$| $$   | $$         | $$  \__/  /$$$$$$  /$$$$$$   /$$$$$$$  /$$$$$$       | $$  \__/  /$$$$$$ | $$  /$$$$$$$
    |  $$$$$$    | $$   | $$  | $$| $$  | $$| $$$$$   | $$ $$ $$   | $$         | $$ /$$$$ /$${'$'}__  $$|____  $$ /$${'$'}__  $$ /$${'$'}__  $$      | $$       |____  $$| $$ /$${'$'}_____/
     \____  $$   | $$   | $$  | $$| $$  | $$| $${'$'}__/   | $$  $$$$   | $$         | $$|_  $$| $$  \__/ /$$$$$$$| $$  | $$| $$$$$$$$      | $$        /$$$$$$$| $$| $$      
     /$$  \ $$   | $$   | $$  | $$| $$  | $$| $$      | $$\  $$$   | $$         | $$  \ $$| $$      /$${'$'}__  $$| $$  | $$| $${'$'}_____/      | $$    $$ /$${'$'}__  $$| $$| $$      
    |  $$$$$$/   | $$   |  $$$$$$/| $$$$$$$/| $$$$$$$$| $$ \  $$   | $$         |  $$$$$$/| $$     |  $$$$$$$|  $$$$$$$|  $$$$$$$      |  $$$$$$/|  $$$$$$$| $$|  $$$$$$$
     \______/    |__/    \______/ |_______/ |________/|__/  \__/   |__/          \______/ |__/      \_______/ \_______/ \_______/       \______/  \_______/|__/ \_______/
                                                                                                                                                                         
     
        Welcome To your Student Grading and management tool!!
        So what are you here for ??
        1-->Calculate grades
        2-->View Results for a Course
        3-->View a student Previous semester result   
        4-->Exit                                                                                                                                             
                                                                                                                                                                         
        """
    )

    while (true) {
        val entry = scanner.nextLine()
        if (entry == null) {
            println("No input detected. Please try again.")
            continue
        }

        when (entry) {
            "1" -> calcGrades()
            "2" -> viewRes()
            "3" -> viewPrevious()
            "4" -> {
                println("Exiting program...")
                exitProcess(0)   // ends the program
            }
            else -> println("Invalid choice, please try again.")
        }
        }
    }


fun main() {
    firstMenu()
    println("Hello Terminal App!")
}
