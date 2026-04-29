package loops
fun main(){
    print("Enter a String: ")
    val st=readln()
    for(c in st)
        println(c)
    val st2=buildString{
        for(i in st.lastIndex downTo 0)
            append(st[i])
    }
    println("New String is $st2")
}