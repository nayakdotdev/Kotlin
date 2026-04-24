package expression
fun main(){
    print("Enter a Number: ")
    val x=readln()
    val xAsInt=x.toIntOrNull()
    val output=when(xAsInt){
        null -> "Not a valid integer"
        3 -> "$xAsInt is 3"
        5 -> "$xAsInt is 5"
        in 4..20 -> "$xAsInt is in between 10 & 20"
        else -> "$xAsInt is an Valid Integer"
    }
    println(output)
}