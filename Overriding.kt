fun main() {
    val obj1 = mi()
    obj1.display()
    println(obj1.name)
   println(obj1.size)
    println(obj1.toString())

}
open class mobile{
    open val name:String = ""
    open val size: Int = 5
    fun makeCall()= println("Calling")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Display")
}
class mi:mobile(){
    override val name: String = "Redmi"
    override val size: Int = 6
    override fun display() {
        super.display() //super keyword se hum parent class ko call kar sakte hain
        println("Mi Display")
    }
//ALT + Insert to override ANY function
    override fun toString(): String {
        return "mi(name='$name', size=$size)"
    }

}

