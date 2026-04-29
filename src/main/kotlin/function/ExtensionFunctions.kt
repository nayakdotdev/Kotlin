package function
fun main(){
    print("Enter a String: ")
    val st=readln()
    val rev=st.revSt()
    println("Reverse of String is $rev")
    if(st==rev)
        println("String is Palindrome")
}
fun String.revSt(): String{
    val rev=buildString{
        for(i in this@revSt.lastIndex downTo 0)
            append(this@revSt[i])
    }
    return rev
}