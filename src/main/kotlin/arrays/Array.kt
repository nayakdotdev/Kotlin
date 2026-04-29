package arrays
fun main(){
    print("Enter an index: ")
    val i=readln().toIntOrNull()
    val arr=intArrayOf(34,7,10,27)+5
    if(i!=null&&i in 0..arr.lastIndex){
        println("Your number is ${arr.getOrNull(i)}")
    } else {
        println("Invalid Index")
    }
}