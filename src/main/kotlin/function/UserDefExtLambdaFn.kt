package function
fun main(){
    print("Enter a String: ")
    val st=readln()
    val letter=st.myFltr{isLetter()}
    println(letter)
}
fun String.myFltr(predicate:Char.()->Boolean):String{
    return buildString{
        for(c in this@myFltr)
            if(c.predicate())
                append(c)
    }
}