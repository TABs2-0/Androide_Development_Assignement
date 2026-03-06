#!/usr/bin/env kotlin

class Student (val fullname: String,
               val age: Int,
               val matricule: String,
               val email: String,
               val phone: String ){


    fun getinfo(): String{
        return "The student is $fullname, with matricule :$matricule ,phone $phone and student email $email"

    }

}