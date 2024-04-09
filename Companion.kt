fun main() {
MyClass.MyObject.f()
//    MyClass.f() it is possible from companion
MyClass.AnotherObject.g()
}
class MyClass{ // declare object within the class
    //Only one companion object is allowed per class

    companion  object MyObject{ // many object can be created in a particular class
        @JvmStatic
        fun f(){
           println("Hello I am From Objects")
        }
    }
    object AnotherObject{ // many object can be created in a particular class
        fun g(){ // now we can direct use this function
            println("Hello I am From Another Objects")
        }
    }
}