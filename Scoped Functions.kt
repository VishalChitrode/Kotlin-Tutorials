fun main() {
//   val emp  =  Employee()
//    emp.age =  19
//    emp.name = "Vishal"
//
//    var x: Employee = emp.apply {
//        age = 30
//        name = "Chitrode"
//    }
//var x: Unit = emp.let(fun(it: Employee) {
//println(it.name)
//println(it.age)
//})


    val emp : Employee =  Employee()
    emp.age =  19
    emp.name = "Vishal"

     emp.let { it: Employee ->
        it.age = 30
     it.name = "Chitrode"
    }
    var x: Int = with(emp){
        age = 40
        name = "ABC"
        2
    }

    emp.run {
        age = 35
        name = "DeepakN"
    }

}
data class Employee(var name: String = "", var age: Int = 10)