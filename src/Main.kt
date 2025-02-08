class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String

)
fun main()
{

    val question1 = Question<String>("What is your name", "Lard", "Easy")
    val question2 = Question<Boolean>("Is the sky green", false, "Easy")
    val question3 = Question<Int>("What is 2 + 2", 4, "Easy")
}