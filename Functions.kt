fun main() {
    println(add(2,3)) //arguments
    println(sub(2,3))
    println(mul(2,3))
    println(div(2,3))
    println(EvenOrOdd(4))
    printMessage(5)
}
fun add(num1:Int, num2:Int):Int{ // by default unit return type
    return num1 + num2
}
fun sub(num1:Int, num2:Int):Int{
    return num1 - num2
}
fun mul(num1:Int, num2:Int):Int{
    return num1 * num2
}
fun div(num1:Int, num2:Int):Int{
    return num1 / num2
}
fun EvenOrOdd(num1: Int) : Unit{
    val result = if (num1 % 2 ==0)"Even" else "Odd"
   println(result)
}
fun printMessage(count: Int){ //parameter (by default val)
    for (i in 1..count){
        println("Hello $i")
    }
}