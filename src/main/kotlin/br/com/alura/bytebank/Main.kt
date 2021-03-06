package br.com.alura.bytebank

import br.com.alura.bytebank.model.Autenticavel
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.model.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 4545)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 4545)
        .let {
        endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let(::println)

    listOf(Endereco(complemento = "casa"),
    Endereco(),
    Endereco(complemento = "apartamento"))
        .filter (predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel{
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, senha = 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("Soma sendo efetuada")
    resultado(a + b)
}




