//Exo 1

//example of predicates illustrations

val isEven:(Int)-> Boolean = {it%2=0}
val isOdd:(Int)-> Boolean = {it%2!=0}
val isPrime:(Int)-> Boolean={n->
    if(n<2) false
    else(2..Math.sqrt(n).none{n%it}=0)//this expression I took grom geeksforgeeks simply creates a range btw 2 and n square and checks if any number there is a factor of n
}
fun  processList(numbers: List<Int>,predicate:(Int)-> Boolean): List<Int>{

 val new_number:List<Int> = numbers.filter(predicate)
     print(new_number)
    return new_number
}

//Exo 2
fun transforming(words: List<String>){
    words
        .filter { it.length < 4 }
        .forEach { word ->
            println("$word has length ${word.length}")
        }

}
//Exo3
data class  Person(val name: String, val age:Int){

    fun complexDataManip(personalities: List<Person>){
        personalities
            .filter{it.name[0]=='A'||it.name[0]=='B'}
            .forEach{person->
                println("The age of${person.name} is ${person.age} years old")
            }
    }
}




fun main(){
    val number=ListOf(1,2,9,10,0,12)
    val people = listOf(
        Person (" Alice " , 25) ,
        Person (" Bob ", 30) ,
        Person (" Charlie ", 35) ,
        Person (" Anna ", 22) ,
        Person (" Ben ", 28)
    )
    processList(number ,isPrime)
    processList(number,isEven)
}