package objectos

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var fora: String = "olá"
    companion object {
        private var variavelDeInstancia: String = "Boa noite"
        @JvmStatic val constanteDeClasse = "Ciclano"

        fun fazer(){
            val local: Int = 7
            if (local > 3){
                val variavelDeBloco = "Beltrano"
                println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
            }
        }
    }
}

fun main() {
    topLevel()
    Coisa.fazer()
    var coisa = Coisa()
    println(Coisa.constanteDeClasse)
    println(coisa.fora)
}