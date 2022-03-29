package model

import model.Conta

class ContaSalario(
    titular: String,
    numeroConta: Int
): Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor){
            this.saldo -= valor
        }
    }

}