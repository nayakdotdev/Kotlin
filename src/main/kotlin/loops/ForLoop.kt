package loops
fun main(){
    print("Enter size of List: ")
    val size=readln().toIntOrNull()?:0
    val list=mutableListOf<Int>()
    var i=0
    for(i in 0 until size){
        print("Enter element #${i+1}: ")
        val x=readln().toIntOrNull()?:continue
        list.add(x)
    }
    println("The List:")
    for(x in list)
        println(x)
}