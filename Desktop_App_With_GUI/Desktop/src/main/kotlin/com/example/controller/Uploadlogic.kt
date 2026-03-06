package com.example.controller

import javafx.stage.FileChooser
import javafx.stage.Stage

class Uploadlogic {

    fun upload(stage: Stage){
        var filechooser = FileChooser()
        filechooser.title="choosing the excel file"
        filechooser.extensionFilters.addAll( FileChooser.ExtensionFilter("Excel Files (*.xlsx)", "*.xlsx"),
                                                FileChooser.ExtensionFilter("Excel 97-2003 (*.xls)", "*.xls"))
        val file= filechooser.showOpenDialog(stage)
        if (file == null){
            println("select a file absolutes path")
        }

    }
}