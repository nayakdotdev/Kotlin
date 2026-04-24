package input
fun main(){
    print("Enter a number: ")
    val n=readln()
    val nAsInteger=n.toIntOrNull()?:0
    println("n is $nAsInteger")
    val isEven=nAsInteger%2==0
    println("Is Even? - $isEven")
    val x=readln()
    val isOdd=x.toIntOrNull()?.rem(2)?.equals(1)
    println("$x is Odd? - $isOdd")
}