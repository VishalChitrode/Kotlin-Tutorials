fun main() {
    val student:MutableMap<Int, String> = mutableMapOf<Int,String>()
    student.put(1,"Vishal")
    student.put(2,"Yash")
    student.put(3,"Muskan")
    student.put(4,"Cheezy")

    println(student.get(1))
    println(student.get(11)) // it will return null
    for ((key:Int, value:String) in student){
        println("$key = $value")
    }
    student[8] = "Deepak"
    println(student[8]) //Mutable Map

    val map:Map<Int,String> = mapOf<Int,String>(1 to "Hello",2 to "World")
    print(map)

}