package oops
fun main(){
    val rect1=Rectangle3(10f,20f)
    val sqr1=Square1(10f)
    println(sumAreas(rect1,sqr1))
}
fun sumAreas(vararg shapes: Shape1): Double {
    return shapes.sumOf { currentShape -> currentShape.area.toDouble() }
}
abstract class Shape1 {
    abstract val area: Float
    abstract val perimeter: Float
}
data class Square1(val side:Float):Shape1(){
    override val area=side*side
    override val perimeter=4*side
}
data class Rectangle3(val length:Float,val breadth:Float):Shape1(){
    override val area=length*breadth
    override val perimeter=2*(length+breadth)
}