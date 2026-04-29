package lists
fun main(){
    print("Enter size of List: ")
    val size=readln().toIntOrNull()?:0
    val list=mutableListOf<Int>()
    var i=0
    while(i<size){
        print("Enter element #${i+1}: ")
        val x=readln().toIntOrNull()?:continue
        list.add(x)
        i++
    }
    println("The List is $list")
}