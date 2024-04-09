fun main() {
var obj = Outer()
    obj.i

//    var nested = Outer.Nested() //
//   println( nested.test())
    var inner = Outer().Nested()
   println( inner.test())
}
class Outer{
    var i = 0

    inner class Nested{ // we use inner
        fun test(){
            println("This is Nested $i") // unresolved error
        }
    }

}