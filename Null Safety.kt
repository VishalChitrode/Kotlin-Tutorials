fun main() {
    var gender : String = "Male" // "Female" , "Others"
    var gender2 : String? = null // Here '?' mean it accept null values also
    //Null value indicates absence of values
    val isAdult : Boolean? = true

    if (gender2 != null) {
        println(gender2.toUpperCase())  // 1st way to check null safety
    }
   println(gender2?.toUpperCase())  // 2nd way to check null safe it will check first is it null or not

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it") // Here it point to the gender2
    }
    var SelectedValues = gender2 ?: "NA" //if gender 2 is null then it will take "NA" else actuall value of gender2
    var values: String = gender2!!.toUpperCase()// if obj is not null it call function else it will throw a error

}
