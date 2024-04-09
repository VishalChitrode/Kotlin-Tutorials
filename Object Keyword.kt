fun main() {
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
    SharingWidget.fbLikes()
    SharingWidget.fbLikes()
    SharingWidget.display()
}
object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0
    fun incrementTwitterLikes() = twitterLikes++
    fun fbLikes() = fbLikes++
    fun display(){
        println("TwitterLikes - $twitterLikes , FBLikes - $fbLikes")
    }

}