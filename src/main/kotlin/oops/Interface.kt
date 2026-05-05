package oops
fun main(){
    val rect1=Rectangle2(10f,20f)
    val sqr1=Square(10f)
    println(sumAreas(rect1,sqr1))
}
fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape -> currentShape.area.toDouble() }
}
interface Shape {
    val area: Float
    val perimeter: Float
}
data class Square(val side:Float):Shape{
    override val area=side*side
    override val perimeter=4*side
}
data class Rectangle2(val length:Float,val breadth:Float):Shape{
    override val area=length*breadth
    override val perimeter=2*(length+breadth)
}