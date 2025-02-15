class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)
val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snicker doodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main()
{
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    fullMenu.forEach{
        println(it)
    }

    var softBakedMenu = cookies.filter {
        it.softBaked
    }
    /*
    println("Soft cookies: ")
    softBakedMenu.forEach{
        println("${it.name} - $${it.price}")
    }
    */
    val groupedMenu = cookies.groupBy {
        if (it.softBaked) "Soft" else "Not soft"
    }
    softBakedMenu = groupedMenu["Soft"] ?: emptyList()
    val crunchyMenu = groupedMenu["Not soft"] ?: emptyList()

    println("Soft cookies: ")
    softBakedMenu.forEach{
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies: ")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}