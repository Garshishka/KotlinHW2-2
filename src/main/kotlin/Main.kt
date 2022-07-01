fun main() {
    val likes = 111
    val likesAsString = likes.toString()
    var endOnlyInOne =if(likesAsString[likesAsString.length-1] =='1') true else false //checking if last char is 1
    val moreThanOneChar = if(likesAsString.length>1) true else false //making bool so the next line works for 0..9
    if(moreThanOneChar && likesAsString[likesAsString.length - 2] == '1') endOnlyInOne = false //if it's "....11"

    val peopleWord = if(endOnlyInOne) " человеку" else " людям"

    println("Понравилось $likes$peopleWord")
}