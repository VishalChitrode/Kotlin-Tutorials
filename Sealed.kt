fun main() {
val Tile = red("Mushroom",25)
//val Tile2 = red("Fire",35)
//    println("${Tile.points} - ${Tile.type}")
//    val points = when(Tile){
//
//    }
    // Here error encountered
}
sealed class Tile //this is abstract class
class red(val type : String, val points :Int) : Tile()
class blue(val points :Int) : Tile()

