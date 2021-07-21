package objectos

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nome: String){
    val nome: String = nome
}


fun main() {

    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3("Pedro")

    println("${p2.nome} e ${p3.nome} são legais!")

}




fun listagem63(){

    class  Cliente{
        var nome: String = ""
    }

    val cliente = Cliente()

    cliente.nome = "Judson Paiva"
    println("O cliente é o ${cliente.nome}")
}
