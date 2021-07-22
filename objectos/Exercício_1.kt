package objectos

fun main() {

    val carro = Carro("Azul");

    print(carro.abrirPortaCarro())

}


class Carro{

    private var cor: String = ""

    constructor(cor: String){
        this.cor = cor
    }

    fun abrirPortaCarro():String {
        return "Porta aberta..."
    }

}