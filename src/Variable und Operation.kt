import kotlin.math.max

fun main() {

    println("gebe drei Zahlen ein")
    val zahl1 = readln().toInt()
    val zahl2 = readln().toInt()
    val zahl3 = readln().toInt()

    var result: Int = maxOf(zahl1, zahl2, zahl3)

    println()
    println()

    println("Die größe Zahl ist: => $result")




}