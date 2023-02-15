
// == Strings ==

const val name = "Alex"
val greeting = null

// == functions ==
fun print(): String {
    return "Hello $name"
}

fun printNull(): String? {
    return null
}

//single expression function
fun print2(): String = "Hello"

fun print3(strVar:String){
    var s = strVar + "Hello"
    println(s)
}

fun main() {

    // == Strings ==
    val s = when (greeting){
        null -> "Hi"
        else -> greeting
    }
    println("$s $name")

    // == functions ==
    println(print())
}