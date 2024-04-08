//fun main() {
//    val obj = calculator()
//    println(obj.add(2,4))
//    println(obj.sub(5,7))
//}
//class calculator{
//    //KOTLIN MEIN PROPERTIES KO INITIAL VALUES DENI PADTI HAIN
//    //KOTLIN HUME RUN TINE ERROR SE BACHATA HAIN
//    lateinit var message :String // lateinit val nahi ho sakti hain isko hum int float boolean nahi banan sakte hain
//    fun add(a :Int, b:Int):Int{ //KOTLIN ADD DEFAULT CONSTRUCTOR
//
//        return a + b
//    }
//    fun sub(a:Int, b:Int):Int{
//        return a-b
//    }
//}

fun main() {
    var i1:Insaan = Insaan("A",23)
    println(i1.name)
    println(i1.age)//getter
    i1.age=1//setter

}
class Insaan(nameParam:String, ageParam:Int){
    var name :String = nameParam
        get() {
            println("Getter is Called")
           return field.toLowerCase()
        }
    var age :Int = ageParam
        set(value) {
            println("Setter is called")
            if (value>0){
                field = value
            }
            else{
                println("age can't be negative")
            }
        }
}