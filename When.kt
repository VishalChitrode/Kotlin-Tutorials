fun main() {
    val animal  = 1
    val result = when(animal.toInt()){
        1 -> "Tiger"
        2 -> "Lion"
        3 -> "Monkey"
        4 -> "Fox"
        5 -> "Snake"
        else -> "No Animal"
    }
    println(result)
}