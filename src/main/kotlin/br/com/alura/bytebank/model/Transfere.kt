package br.com.alura.bytebank.model

interface Transfere {
    fun transfere(valor: Double, destino: Conta, senha: Int)
}