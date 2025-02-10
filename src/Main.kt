enum class Difficulty {
    EASY, Medium, Hard
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty

)

class Quiz()
{
    val question1 = Question<String>("What is your name", "Lard", Difficulty.EASY)
    val question2 = Question<Boolean>("Is the sky green", false, Difficulty.EASY)
    val question3 = Question<Int>("What is 2 + 2", 4, Difficulty.EASY)

    companion object StudentProgress{
        var total:Int = 10
        var answered:Int = 3
    }
}

val Quiz.StudentProgress.progressText: String
    get() = "$answered of $total answered"

fun Quiz.StudentProgress.printProgress()
{
    repeat(answered){print("▓")}
    repeat(total - answered){ print("▒") }
    println()
    println(Quiz.progressText)

}
fun main()
{
    Quiz.printProgress()
}