package operators
fun main(){
    val x=11
    val y=40
    val bothEven=x%2==0&&y%2==0
    val eitherOdd=x%2==0||y%2==0
    println("Are $x & $y both even? $bothEven")
    println("Are $x & $y either even? $eitherOdd")
}