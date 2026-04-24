package input
fun main(){
    print("Enter a number: ")
    val n=readln()
    val nAsInteger=n.toInt()
    println("n is $n")
    print("Is n Even? - ${nAsInteger%2==0}")
}