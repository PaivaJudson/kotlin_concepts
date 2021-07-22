package objectos

data class Motorista(val id: String,
                     val numero: Int,
                     val primeiroNome: String,
                     val ultimoNome: String,
                     val nacionalidade: String
                     )

data class Constructor(val id: String, val name: String, val motoristas: List<Motorista>)


fun main() {

    var motorista = Motorista("1", 202101, "João", "Graça", "Angolana")

    with(motorista){
        println("$id $numero $primeiroNome $ultimoNome $nacionalidade")
    }
}


