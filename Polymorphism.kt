//fun main() {
//    val circle :circle = circle(4.0)
//    val Sqaure :Square = Square(3.0)
//    println(circle.area())
//    println(Sqaure.area())
//
//
//    val shapes:Array<Shape> = arrayOf(circle(2.0),Square(3.0),Square(4.0))
//    calculator(shapes)
//
//}
//
//fun calculator(shapes:Array<Shape>){
//    for (shape:Shape in shapes){
//        println(shape.area())
//    }
//}
//
//open class Shape(){
//    open fun area() :Double{
//        return 0.0
//    }
//}
//class circle(val radius : Double) : Shape(){
//    override fun area(): Double {
//        return Math.PI * radius * radius
//    }
//
//}
//class Square(val side: Double):Shape(){
//    override fun area(): Double {
//        return side * side
//    }
//}