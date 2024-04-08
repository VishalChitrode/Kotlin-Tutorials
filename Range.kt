fun main() {
//    val number = 12
//    if (number in 1..10){ // upper bound exist
//        println("number exist")
//    }else{
//        println("number doesn't exist")
//    }
    val number = 1
    if (number in 1 until 10){ // upper bound doesn't exist
        println("number exist")
    }else{
        println("number doesn't exist")
    }
}