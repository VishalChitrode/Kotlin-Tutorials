fun main() {
CalculateTimeAndRun {
  loop(1)
}
    CalculateTimeAndRun {
  loop(1000000)
}
}
inline fun CalculateTimeAndRun(fn: ()->Unit){
    val start:Long = System.currentTimeMillis()
    fn()
    val end:Long = System.currentTimeMillis()
    println("Time taken $end - $start ms")
}
fun loop(n:Int){
    for (i in 1..n){

    }
}