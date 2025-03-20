
enum class Difficulty {
    EASY, Medium, Hard
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty

)
interface ProgressPrintable
{
    val progressText: String
    fun printProgressBar()

}
class Quiz: ProgressPrintable
{
    override val progressText: String
        get() = "$answered of $total answered"

    override fun printProgressBar()
    {
        repeat(answered){print("▓")}
        repeat(total - answered){ print("▒") }
        println()
        println(progressText)
    }

    val question1 = Question<String>("What is your name", "Lard", Difficulty.EASY)
    val question2 = Question<Boolean>("Is the sky green", false, Difficulty.EASY)
    val question3 = Question<Int>("What is 2 + 2", 4, Difficulty.EASY)

    companion object StudentProgress{
        var total:Int = 10
        var answered:Int = 3
    }

    fun printQuiz()
    {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

fun main()
{
    Quiz().apply { printQuiz() }
}