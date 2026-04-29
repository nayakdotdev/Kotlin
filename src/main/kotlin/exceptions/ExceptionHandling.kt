package exceptions
fun main(){
    print("Enter a number: ")
    val input=readln()
    val inputAsInt=try{
        input.toInt()
    } catch(e: NumberFormatException){
        0
    }
    val output=when(inputAsInt){
        3 -> "Integer is Three"
        5 -> "Integer is Five"
        in 10..20 -> "Between 10 & 20"
        else -> "No Idea what to Print"
    }
    println(output)
}