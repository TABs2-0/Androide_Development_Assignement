
package scripts

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import scripts.DAO

val dao = DAO()

class StudentService(){

    fun login(matricule: String): Boolean{
        var info = dao.getStudentInfo(matricule)
        return if (info.next()){
                val mat = info.getString("matricule")
                val name= info.getString("fullname")
                if(matricule == mat){
                    println("Welcome to student $name grading zone ")
                true}
                else{
                    false
                }
            }else{
                false
            }


    }
    fun calcGrade( exam_mark:Int, ca_mark: Int): String{
        val final_mark=(exam_mark*0.7)+(ca_mark*0.3)
        return when {
            final_mark >=80->"A"
            final_mark >=70 ->"B"
            final_mark >= 60->"C"
            final_mark >= 50-> "D"
            else -> "F"
        }
    }

}


