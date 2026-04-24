package input
fun main(){
    print("Enter a number: ")
    val n=readln()
    val nAsInteger=n.toIntOrNull()
    println("n is $nAsInteger")
}