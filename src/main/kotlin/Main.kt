const val name = "Alex"
val greeting = null

fun main() {
    val s = if(greeting!=null) greeting else "Hi"


    println("$s $name")
}