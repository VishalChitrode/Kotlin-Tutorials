fun main() {
    val obj1  = parent() // called only parent constructor
//    val obj2 = child() // first called parent then child
//    obj2.myMethod()
//    obj2.myMethod2()

}
open class parent{
    init {
        println("Parent constructor called")
    }
    val name :String = ""
    fun myMethod(){
        println("I am in parent class")
    }
}
class child : parent(){
    init {
        println("child constructor called")
    }
    val name2 :String = ""
    fun myMethod2(){
        println("I am in child")
    }
}