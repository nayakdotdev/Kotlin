package loops
fun main(){
    print("Enter no. of elements: ")
    val size=readln().toIntOrNull()?:0
    var s=0
    var i=0
    while(i<size){
        print("Enter element #${i+1}: ")
        val x=readln().toIntOrNull()?:continue
        s+=x
        i++
    }
    println("Sum of elements is $s")
}