package funcoes

import java.util.*

fun main() {

    val(hora, minuto, segundos) = agora()
    println("$hora: $minuto: $segundos")

}

data class Horario(val hora: Int, val minutos: Int, val segundos: Int)

fun agora(): Horario{
    val agora = Calendar.getInstance()
    with(agora){
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun somaR(): Int{
    return 0
}
