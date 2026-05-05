package oops
import kotlin.math.sqrt
fun main(){
    val rect1=Rectangle1(w=10f,h=20f)
    val rect2=rect1.copy(h=10f)
    println(rect1)
    println(rect1==rect2)
}
data class Rectangle1(val w:Float,val h:Float){
    val diag=sqrt(w*w+h*h)
    val area=w*h
}