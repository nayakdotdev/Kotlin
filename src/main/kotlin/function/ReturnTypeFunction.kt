package function
fun main(){
    print("Enter a String: ")
    val st=readln()
    val rev=revStr(st=st)
    println("Reverse of String is $rev")
    if(st==rev)
        println("String is Palindrome")
}
fun revStr(st:String): String{
    val rev=buildString{
        for(i in st.lastIndex downTo 0)
            append(st[i])
    }
    return rev
}