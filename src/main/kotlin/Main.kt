fun main() {
    val likes = 61
    val peopleWord = if(likes.toString()[likes.toString().length-1] == '1') " человеку" else " людям"

    println("Понравилось $likes$peopleWord")
}