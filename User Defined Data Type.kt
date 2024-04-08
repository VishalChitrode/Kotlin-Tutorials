

fun main() {
 val a = 20
    println(a.plus(30))
    println(a.toFloat())
    val vishal : person = person("Vishal", 17) // class obj
    val pritesh :person = person("Pritesh", 22) //class obj
    println(vishal.canVote())
    println(pritesh.canVote())

}
class person(var name:String, var age:Int){// properties and field
    fun canVote():Boolean{ //methods
        return age>18
    }
}