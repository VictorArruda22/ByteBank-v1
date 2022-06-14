package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Endereco

fun testaNullable(){
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua teste", complemento = "prédio")
    println(enderecoNulo?.logradouro)
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento está vazio.")
        println(tamanhoComplemento)
    }
    teste("")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}
