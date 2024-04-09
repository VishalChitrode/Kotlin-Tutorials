fun main() {
//    var testObj = object { // object expression
//        var x : Int = 10
//        fun method(){
//            println("I am Object")
//        }
//
//
//    }
//
//    println(testObj.x )
//    var obj = object  : Cloneable{
//        override fun clone() {
//            println("I am Clone")
//        }
//
//    }
//obj.clone()
    var obj2 = object : Person("Vishal Chitrode"){
        override fun fullName() {
            super.fullName()
            println("$name")
        }
    }
    obj2.fullName()
}
interface  Cloneable{
    fun clone()
}
open class Person(var name :String){
    open fun fullName() = println("My name is $name")
}
