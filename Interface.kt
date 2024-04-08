//import java.util.Objects
//
//fun main() {
//dragObjects(arrayOf(Circle(3.0),Square(4.0),Triangle(2.0,3.0)))
//}
//fun dragObjects(objects: Array<draggable>){
//    for (obj:Shape in objects){
//        obj.drag()
//    }
//}
//
//interface draggable(){
//    val dragSpeed : Int
//    fun drag()
//}
//interface cloneable(){
//    fun clone()
//}
//
//abstract class Shape: draggable, cloneable{
//    abstract fun area() : Double
//    abstract fun drag()
//}
//class Circle(val radius: Double):Shape(){
//    override fun area(): Double = Math.PI * radius * radius
//    override  fun drag() = println("Circle is gragging")
//}
//class Square(val side: Double) : Shape() {
//    override fun area(): Double = side * side
//    override  fun drag() = println("Square is gragging")
//}
//class Triangle(val base: Double, val height : Double) : Shape() {
//    override fun area(): Double = 0.5 * base * height
//    override  fun drag() = println("Triangle is gragging")
//}