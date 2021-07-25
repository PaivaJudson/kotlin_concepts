package introducaoAoKotlin


fun main() {
    var resultado1 = calculate(3, 4, ::soma)
    var resultado2 = calculate(3, 4) {a, b -> a * b}

    val name = "Maria Clara"
    for(n in name){ println(n)}

    
    println(resultado1)
    println(resultado2)
}


fun soma(a: Int, b: Int): Int{
    return a + b
}

fun calculate(a: Int, b:Int, funcao:(Int, Int) -> Int): Int{
    return funcao(a, b)
}













