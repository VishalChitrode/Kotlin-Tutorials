fun main() {
    val a = 2
    val b = 5
//    if (a>b) {
//        println("a is greater than b" + a)
//    }
//    else if (b>a){
//        println("b is greater than a\n" + b)
//    }else{
//        println("a is equal to b")
//    }
    val result = if (a>b) {
       ("a is greater than b" + a)
    }
    else if (b>a){
        ("b is greater than a\n" + b)
    }else{
        ("a is equal to b")
    }
    println(result)
}