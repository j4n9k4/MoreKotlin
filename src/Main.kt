enum class Difficulty {
    EASY, Medium, Hard
}

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty

)
fun main()
{

    val question1 = Question<String>("What is your name", "Lard", Difficulty.EASY)
    val question2 = Question<Boolean>("Is the sky green", false, Difficulty.EASY)
    val question3 = Question<Int>("What is 2 + 2", 4, Difficulty.EASY)
}