fun main() {
val day = Day.Monday
//    println(day)
//    println(day.number)

//    for (i in Day.values() ){
//        println(i)
//    }
    println(day.printFormattedDay())

} //enum is a set of (constant) values assign to  var
enum class Day(val number:Int){
    Monday(1), //In enum value is instance (in enum we restrict values)
    Tuesday(2), // but in sealed we restrict type (set of type inme se kisi type ka obj bana lo)
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7); // to  define methods we need to put semicolon after this value

   fun printFormattedDay(){
       println("Day is $this")
   }
}