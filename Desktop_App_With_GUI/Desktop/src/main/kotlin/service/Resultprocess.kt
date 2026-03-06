package service
import com.example.model.Students

class Resultprocess {

    fun calcGrade(students: List<Students>){

       students.forEach {  val final_mark=(it.exam_mark*0.7)+(it.ca_mark*0.3)
           it.grade= when {
               final_mark >= 80->"A"
               final_mark >= 70 ->"B"
               final_mark >= 60->"C"
               final_mark >= 50-> "D"
               else -> "F"
           }}
    }
}