package objectos

class Filme {

    val nome: String
    val anoLancamento: Int
    val genero: String


    init {

    }

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

    constructor(nome: String, genero: String){
        this.nome = nome
        this.genero = genero
        this.anoLancamento = 2021
    }
}


class Filme2(val nome: String, val anoLancamento: Int, val genero: String)


class Filme3(nome: String, anoLancamento: Int, genero: String){

    val nome: String
    val anoLancamento: Int
    val genero: String


    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

}


fun main() {

    val filme1 = Filme("O Poderoso Chefão", 1972, "Drama")
    val filme2 = Filme("A Poderosa Mulher", "Romance")
    val filme3 = Filme("Monstros S.A", 2001, "Comédia")
    val filme4 = Filme("Os Incríveis", 2004, "Ação")

    println("${filme1.nome} foi lançado em ${filme1.anoLancamento}")
    println("${filme2.nome} foi lançado em ${filme2.anoLancamento}")
    println("${filme3.nome} foi lançado em ${filme3.anoLancamento}")
    println("${filme4.nome} foi lançado em ${filme4.anoLancamento}")

}