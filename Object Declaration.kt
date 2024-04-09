fun main() {
println(P.num)
    println(Q.test())
}
object P{
    val num :Int = 10

}
object Q{
    val num :Int = 20
    fun test(){
        println("This is Function of object Q ")
    }
}