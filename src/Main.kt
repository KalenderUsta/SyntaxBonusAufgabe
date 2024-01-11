fun main() {

    println("geben sie Ihren Namen ein")
    val name:String = readln()


    println("Hallo $name geben Sie bitte Ihr gewicht in Kilogramm ein")
    var weight: Double = readln().toDouble()


    println("geben Sie bitte Ihre Körpergröße ein")
    var bodySize: Double = readln().toDouble()

    var result: Double = bodySize.toDouble()


    val bmi: Double = weight / (bodySize * bodySize)
    println("$weight / $bodySize * $bodySize = $bmi")
    println("Ihr BMI Wert ist \"$bmi\"")
}