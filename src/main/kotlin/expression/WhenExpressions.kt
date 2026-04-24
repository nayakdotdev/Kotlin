package expression
fun main(){
    val n=readln()
    val nAsInt=n.toIntOrNull()
    if(nAsInt!=null){
        println("$nAsInt is a valid integer")
        val output=when{
            nAsInt%2==0 -> "$nAsInt is Even"
            nAsInt<10 -> "$nAsInt is Odd and less than 10"
            else -> "$nAsInt is Odd and atleast 11"
        }
        println(output)
    } else{
        println("$nAsInt is not a valid integer")
    }
}