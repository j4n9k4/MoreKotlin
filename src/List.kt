fun main()
{
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    println()

    for(planet in solarSystem)
    {
        println(planet)
    }
}