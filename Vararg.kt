fun main() {
    add(1,2,3,4,5)
    add(1,1,1,1,1,1,1,1,1,1,1,1,1,1)
}
fun add(vararg values : Int){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}