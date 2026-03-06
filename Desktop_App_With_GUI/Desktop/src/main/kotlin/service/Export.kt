package service
import com.example.model.Students
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream
import java.io.File
import com.lowagie.text.Document
import com.lowagie.text.Paragraph
import com.lowagie.text.pdf.PdfWriter


class Export {


    fun exportExcel(students: List<Students>) {

        val workbook = XSSFWorkbook()// nb I should investigate more on this apache.poi sub library
        val sheet = workbook.createSheet("Grades")

        var rowIndex = 0

        students.forEach {

            val row = sheet.createRow(rowIndex++)// I like the way this cells are created yoan next time u read this remember its to create rows as said on stack overflow

            row.createCell(0).setCellValue(it.name)
            row.createCell(1).setCellValue(it.email)
            row.createCell(2).setCellValue(it.matricule)
            row.createCell(3).setCellValue(it.ca_mark)
            row.createCell(4).setCellValue(it.exam_mark)
            row.createCell(5).setCellValue(it.grade)
        }

        FileOutputStream("results.xlsx").use {
            workbook.write(it)
        }
    }

    fun exportCSV(students: List<Students>) {

        File("output.csv").printWriter().use { out ->

            out.println("Name,Email,Matricule,CA,Exam,Grade")

            students.forEach {

                out.println("${it.name},${it.email},${it.matricule},${it.ca_mark},${it.exam_mark},${it.grade}")
            }
        }
    }

    fun exportPDF(students: List<Students>){
        val document = Document()

        PdfWriter.getInstance(document, FileOutputStream("output.pdf"))

        document.open()

        students.forEach {

            document.add(Paragraph(
                "${it.name}  ${it.matricule}  Grade: ${it.grade}"
            ))
        }

        document.close()
    }
}