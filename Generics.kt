fun main() {
    var obj = IntContainer(3)
    println(obj.getValue())
    var sContainer = Container<String>("Vishal Chitrode")
    println(sContainer.getValue())
    var iContainer = Container<Int>(45)
    println(iContainer.getValue() )
    val list: List<String> = listOf<String>()

}
class Container<T>(var data: T){
    fun setValue(value :T){
        data = value
    }
    fun getValue(): T{
        return data
}}
class IntContainer(var data: Int){
    fun setValue(value :Int){
        data = value
    }
    fun getValue(): Int{
        return data
    }
}
    class StringContainer(var data: String){
    fun setValue(value :String){
        data = value
    }
    fun getValue(): String{
        return data
    }}
