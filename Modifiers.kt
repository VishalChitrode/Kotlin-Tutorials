fun main() {

}
//internal class A // by default public "EveryWhere" or "with in a module"
//private internal class A // public only access in this file "Within File"
// protected class A // protected not work in top level function it will
//work only inside fun // N/A

//val B = 10      // internal only available in this module
//fun gn(){
//
//}
open class A{
  public var a = 10 // everwhere
   private var b = 10 // with in class
  protected var c = 10 // Subclasses
  internal var d = 10 // with ina module
}
class B : A(){
    fun test(){
        println(a)
//        println(b) // bcoz private
        println(c)
        println(d)
    }

}