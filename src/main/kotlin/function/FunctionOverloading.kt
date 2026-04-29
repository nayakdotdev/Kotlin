package function
fun revSt(st:String):String{
    val rev=buildString{
        for(i in st.lastIndex downTo 0)
            append(st[i])
    }
    return rev
}
fun revInt(x:Int):Int{
    return x.toString().revSt().toInt()
}
fun main(){
    print("Enter a Integer: ")
    val n=readln().toInt()
    println("Reverse of Integer is ${revInt(x=n)}")
}