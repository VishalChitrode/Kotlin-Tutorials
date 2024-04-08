fun main() {
    val audi = automobile("audi",300, )
    val bmw = automobile("bmw",300) // obj
    //val car3 = automobile()
//    println(audi.type)
//    println(audi.run)
//    println(audi.drive())
//    println(audi.brack())
    val Vishal = man("A",14)
    println(Vishal.age)
    println(Vishal.name)
    val Pritesh = man("B",18)
    println(Pritesh.age)
    println(Pritesh.name)


}
class automobile(var name:String, var type:String, var run:Int, hasAirBag: Boolean){ // primary constructor
    var AirBags = hasAirBag
    fun drive(){}
    fun brack(){}
    constructor(nameParam:String, runParam:Int) : this(nameParam, "Petrol", runParam,true)// secondary construction humesha apne primary
    //constructor ko call karta hain
}
class man(nameParam:String, ageParam:Int){
    val name:String = nameParam
    val age:Int = ageParam }
//
//}