package model

import model.Conta

interface Transfere {
    fun transfere(valor: Double, destino: Conta): Boolean
}