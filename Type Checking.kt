fun main() {
    val circle = Circle(4.0)
    val player = Player("Vishal")

//    if (circle is Circle){
//        println("This is Circle")
//    }
    val arr: Array<Draggable> = arrayOf(circle, player)
        for (obj: Draggable in arr) {
            if (obj is Circles) {
                println(obj.area())
            } else {
                (obj as Player).sayMyName()
            }

        }
    }
interface Draggable{
    fun drag()
}
abstract class Shapes : Draggable{
    abstract fun area() : Double
}
class Circles(val radius:Double):Shapes(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is Dragging")
    }
}

class Player (val name : String):Draggable{


    override fun drag() {
        println("$name is Dragging")}
        fun sayMyName() = println("Hey my name is - $name" )
    }
