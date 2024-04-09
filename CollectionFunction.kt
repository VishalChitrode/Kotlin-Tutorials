fun main() {
val nums:List<Int> = listOf(1,2,3,4,5)
    println(isOdd(2))
    println(isOdd(3))

//    val list: List<Int> = nums.filter (::isOdd) // if condition true it will accept the parameter else ignore the parameter
//    println(list)
    val userList:List<User> = listOf(
        User(1,"Vishal"),
        User(2,"Yash"),
        User(3,"Priesh"),
        User(4,"Muskan")
    )
    println(userList)
    val list :List<Int> = nums.map { it*it }
    println(list)
    val paidUserList :List<PaidUser> = userList.map {
        PaidUser(it.id, it.name, "Paid")
    }
    println(paidUserList)
 // for Each N
    for (i in nums){
        println(i)
    }
    nums.forEach{ println(it) }
}
fun isOdd(a:Int):Boolean{
    return a%2 !=0
}
data class User(val id :Int, val name:String)
data class PaidUser(val id :Int, val name:String,val type:String)