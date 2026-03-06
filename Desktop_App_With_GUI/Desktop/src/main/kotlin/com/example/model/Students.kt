package com.example.model

data class Students(
    val name: String,
    val email: String,
    val matricule: String,
    val ca_mark: Double,
    val exam_mark: Double, //I decided to remove phone number to reduce processing time for now
    var grade: String =""
) {



}