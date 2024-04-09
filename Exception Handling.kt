import org.w3c.dom.css.Counter

fun main() {



    /*
    Exception Handling --> Those Error which we can handle (Exception jinhe hum handle kar sakte hain)
    Try Catch Finally -->
    Throw Exception
    */

    var arr:Array<Int> = arrayOf(1,2,3)
    try {
        println(arr[4])                     // wo wala code jisme error aa sakti hain
    }
    catch (ex: NullPointerException){

    }// with try we will use many catch blocks
    catch (e: Exception){
       println("Revise your concepts")                         // it will handle the above error if encountered

    }finally {
        println("I will execute no matter what")               // wo wala code error aaye y nahi par finally wala code execute honga
    }

    println("This will not run")

  createUserList(5)
    createUserList(-2)


}

fun createUserList(count :Int){
    if (count<0){
        throw IllegalArgumentException("count must be greater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}