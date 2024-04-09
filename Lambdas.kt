import kotlin.math.pow
import kotlin.reflect.KFunction2

fun main() {
//    println(sum(4, 5))
//    println(pow(4, 5))

    var fn: (num1: Int, num2: Int) -> Int = ::sum // define such type of var. if we want to store functiona in a variable
    println(fn(2,3))
    calculator(2,3,::pow)

    //Lambdas Expressions
    
    val Lambdas: (Int, Int) -> Int = { x:Int, y:Int -> x +y}
    val multiLineLambda ={
        println("Hello Lambdas")
        val a:Int = 2+3
        "Lambdas Expressions"

    }
    println(multiLineLambda())

    val singleParam:(Int) -> Int = {it + it
    }
    calculator(1,2){a,b -> a+b}

}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun pow(num1: Int, num2: Int): Int {
    return num1.toDouble().pow(num2).toInt()
}
fun calculator(a:Int,b:Int, gn:(Int, Int) -> Int){
    val output = gn(a,b)
    println(output)

}
