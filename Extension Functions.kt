fun main() {
    println("Extension Functions".formattedString())
}
fun String.formattedString(): String {
    return "-------------------\n$this\n-------------------"
}

// 