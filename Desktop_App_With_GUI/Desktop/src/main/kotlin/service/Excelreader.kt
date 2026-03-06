package service
import com.example.model.Students
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.File


class Excelreader {


    class ExcelReader {

        fun readStudents(file: File): List<Students> {

            val students = mutableListOf<Students>()

            val workbook = WorkbookFactory.create(file)
            val sheet = workbook.getSheetAt(0)

            for (row in sheet.drop(1)) {

                val name = row.getCell(0).stringCellValue
                val email = row.getCell(1).stringCellValue
                val matricule = row.getCell(2).stringCellValue
                val ca_mark = row.getCell(3).numericCellValue
                val exam_mark = row.getCell(4).numericCellValue

                students.add(Students(name,email,matricule, ca_mark ,exam_mark))
            }

            return students
        }
    }
}