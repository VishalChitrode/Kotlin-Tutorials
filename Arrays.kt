fun main(){
    var arr: Array<String> = arrayOf("one", "two", "three")
    for ((i,e) in arr.withIndex()){
        println("$i - $e")

    }
    println(arr[0])
    println(arr.get(1))
    arr.set(0,"vishal")
    for ((i,e) in arr.withIndex()){ // print with index
        println(e)
    }
    println(arr.size) // print size
    println(arr[3]) // index out of bound

}