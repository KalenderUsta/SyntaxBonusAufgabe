fun main() {

    println("gebe deine erste Zahl")
    val zahl1 = readln().toInt()

    println("gebe deine Zweite Zahl")
    val zahl2 = readln().toInt()

    var zahl3 = zahl1 / zahl2
    println(zahl3)

    var zahl4 = zahl1 % zahl2
    println("$zahl1 geteilt durch $zahl2 ist $zahl3 mit Rest $zahl4")
}