fun main() {
    maps()                                  // invoking the functions below inside the main function
    sayHello("hello", listOf("Kotlin", "Programming", "Comic Books"))
}
fun maps() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    interestingThings.add("Dogs")
    println(interestingThings)            //print out all the items in lists

    var map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }
}
fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet") //print the passed in parameters that says Hello to each item
    }
}