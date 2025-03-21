import kotlinx.coroutines.*
import kotlin.system.*

fun main()
{
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            println(getWeatherReport())

        }

            println("Have a nice day")
    }


    println("Execution time: ${time/ 1000.0} seconds")
}

suspend fun getForecast(): String
{
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature():String
{
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0c"
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }

    delay(200)
    temperature.cancel()

    "${forecast.await()}"
}