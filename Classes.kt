fun main() {
    var audi :car = car("audi", "petrol", 700)
    var bmw : car = car("BMW", "petrol", 300)
    println(audi.name)
    println(audi.type)
    println(audi.Run)
    println(audi.drive())
    println(audi.brack())

}
class car(val name:String, val type:String, val Run:Int){
    fun drive(){
        println("$name Car is driving")
    }
    fun brack(){
        println("Brack applied")
    }
}