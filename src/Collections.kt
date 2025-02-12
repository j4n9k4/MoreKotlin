fun main() {

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Mars","Earth")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets

    solarSystem[2] = "Little Earth"

    println(solarSystem[0])
    println(solarSystem[2])
}