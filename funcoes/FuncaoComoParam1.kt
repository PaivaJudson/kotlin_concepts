package funcoes

class Operacoes{

    fun somar(a: Int, b: Int):Int{
        return a + b
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

fun subtrair(a: Int, b: Int): Int{
    return a - b
}

fun calcular(a: Int, b: Int, funcao:(Int, Int)-> Int): Int{
    return funcao(a , b)
}

fun main() {

    println(calcular(4, 2, ::subtrair))

}