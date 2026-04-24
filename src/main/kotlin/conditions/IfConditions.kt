package conditions
fun main(){
    val n=readln()
    val nAsInt=n.toIntOrNull()
    if(nAsInt!=null) {
        val isEven=nAsInt%2==0
        if(isEven)
            println("$nAsInt is Even")
        else
            println("$nAsInt is Odd")
    }
    else
        println("InValid! Enter a Integer number")
}