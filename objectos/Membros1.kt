package objectos

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {

    var dataNascimento: Data = Data(dia = 11, mes = 10, ano = 2003)

    println("${dataNascimento.dia}/${dataNascimento.mes}/${dataNascimento.ano}")

    with(dataNascimento){
        println("${dia}/${mes}/${ano}")
    }

    dataNascimento.mes  = 11

    println(dataNascimento.formatar())
}