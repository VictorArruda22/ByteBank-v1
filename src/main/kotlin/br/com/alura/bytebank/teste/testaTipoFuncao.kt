package br.com.alura.bytebank.teste

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(5, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int{
    return a + b
}

class Soma: (Int, Int) -> Int{
    override fun invoke(a: Int, b: Int): Int = a + b

}
fun testaMinhaFuncao() {
    //    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(5, 10))

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(5, 10))
}