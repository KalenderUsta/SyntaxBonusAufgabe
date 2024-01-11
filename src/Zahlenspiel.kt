import kotlin.random.Random

fun main() {
    var blue =  "\u001B[34m"
    var green = "\u001B[32m"
    var reset = "\u001B[0m"

    val random: Int = Random.nextInt(1,101)

    println("gebe deinen Namen ein")
    val name = readln()


    println("$name gebe eine Zahl von 1 bis 100 ein")
    val zahl1 = readln().toInt()

    println("Ihr zahl $green $zahl1 $reset und die Gewinn Zahl $blue $random $reset")
}