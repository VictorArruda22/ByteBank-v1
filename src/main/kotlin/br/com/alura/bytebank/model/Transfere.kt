package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.Conta

interface Transfere {
    fun transfere(valor: Double, destino: Conta): Boolean
}