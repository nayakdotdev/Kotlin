package function
fun main(){
    print("Enter a String: ")
    val st=readln()
    reverse(st)
}
fun reverse(st:String){
    val rev=buildString{
        for(i in st.lastIndex downTo 0)
            append(st[i])
    }
    println(rev)
}