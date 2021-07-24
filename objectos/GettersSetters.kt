package objectos

class Cliente {
    constructor(nome: String){
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isEmpty() } ?: "Anônimo"
        }
}



fun main() {

    val c1 = Cliente("")
    println(c1.nome)

    val c2 = Cliente("Pedro")
    println(c2.nome)

}
