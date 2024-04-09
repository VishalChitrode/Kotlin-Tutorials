fun main() {
    /*

Mutable List (Can be changed i.e. elements can be added/removed/replaced)
Immutable List (Can't be changed i.e. elements can't be added/removed/replaced)

    */
//val nums:List<Int> = listOf(1,2,3) // list bydefault Immutable
//    println(nums.indexOf(3)) // use to know the position of list element
//    println(nums.contains(4)) // check element exist or not


    val nums:MutableList<Int> = mutableListOf(1,2,3) /* list bydefault Immutable */
    println(nums.indexOf(3)) // use to know the position of list element
    println(nums.contains(4)) // check element exist or not
    nums[1] = 7
    nums.add(5)
//    nums.remove(1)
    println(nums)


}