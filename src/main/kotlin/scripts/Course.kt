data class Course(
    val course_code: String,
    val course_name: String,
    val course_lecturer: String,
    val course_semester: String,
    val course_level:String){


    fun getinfo(): String{
        return "The course has as name  $course_name, with code :$course_code ,lectured  by  $course_lecturer and taken on semester $course_semester"
    }
}