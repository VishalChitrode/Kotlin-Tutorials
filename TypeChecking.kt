import java.util.Objects

fun main() {
   var obj1 : Circle = Circle(4.0)
    if (obj1 is Circle){
        println("This is Circle class")
    }
}

abstract class Shape{
    abstract fun area() : Double
    abstract fun drag()
}
class Circle(val radius: Double):Shape(), Draggable {
    override fun area(): Double = Math.PI * radius * radius
    override  fun drag() = println("Circle is gragging")
}
