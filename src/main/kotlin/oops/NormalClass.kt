package oops
import kotlin.math.sqrt
fun main(){
    var rect1=Rectangle(w=10f,h=20f)
    println(rect1.w)
    println(rect1.h)
    println("Diagonal is ${rect1.diag}")
    println("Area is ${rect1.area}")
    var rect2=Rectangle(w=20f,h=40f)
    println("Max Area is ${maxArea(rect1,rect2)}")
    println(rect1==rect2)
    rect2=rect1
    println(rect1==rect2)
}
class Rectangle(val w:Float,val h:Float){
    val diag=sqrt(w*w+h*h)
    val area=w*h
}
fun maxArea(rect1: Rectangle,rect2: Rectangle):Float{
    return maxOf(rect1.area,rect2.area)
}