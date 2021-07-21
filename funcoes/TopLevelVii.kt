package funcoes

fun main() {

    println(min(2.0, 4))

}

fun min(a: Int, b: Int): Int{
    return if (a > b) a else b
}

fun min(a: Double, b: Int): Double{
    return if (a > b) a else b.toDouble()
}



