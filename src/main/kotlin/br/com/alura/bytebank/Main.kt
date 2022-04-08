import br.com.alura.bytebank.model.Endereco

fun main() {

    val endereco = Endereco()

    imprime(Unit)
    imprime(endereco)
    imprime(1.0)
    imprime(1)
}

fun imprime(valor: Any): Any{
    println(valor)
    return valor
}













