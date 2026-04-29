package function
fun main(){
    print("Enter a String: ")
    val st=readln()
    val letterSt=st.filter{it.isLetter()}
    println(letterSt)
    val arr=intArrayOf(1,2,3,4,5)
    val even=arr.filter{it%2==0}
    println(even)
    val sqr=arr.map{it*it}
    println(sqr)
}