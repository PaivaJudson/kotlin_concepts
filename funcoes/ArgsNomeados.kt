package funcoes

fun main() {
    println(potencia(3, 1))
    println(potencia(base = 4, expoente = 0))
}


fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado(a) à $chefe."
}


fun incremento(i: Int): Int{
    var num = i
    return num++
}

fun potencia(base: Int = 2, expoente: Int = 1): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}




