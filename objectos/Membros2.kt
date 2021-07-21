package objectos

class Calculadora {

    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora{
        resultado *= valor
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun mostrarValoresArrays(vararg lista: Int): Unit{
        lista.forEach { println(it) }
    }

}

fun main() {
    val calcudora = Calculadora()

    calcudora.somar(1, 2, 3).multiplicar(3).print()
    calcudora.somar(7, 10).print().limpar()
    println(calcudora.obterResultado())
    /*calcudora.somar(3, 5, 6, 8)
    calcudora.multiplicar(4)
    //calcudora.mostrarValoresArrays(5, 10, 15, 20)

     */
}