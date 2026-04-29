package function
fun main() {
    print("Enter a String: ")
    val st=readln()
    val letter=st.myFilter{it.isLetter()}
    println(letter)
}
fun String.myFilter(predicate:(Char)->Boolean):String{
    return buildString{
        for(c in this@myFilter)
            if(predicate(c))
                append(c)
    }
}