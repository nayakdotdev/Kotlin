package input
fun main(){
    print("Enter a number: ")
    val n=readln()
    val nAsInteger=n.toIntOrNull()
    println("n is $nAsInteger")
    val isEven=nAsInteger!!%2==0
    println("Is Even? - $isEven")
}