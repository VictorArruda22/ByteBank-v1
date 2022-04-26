package br.com.alura.bytebank.model

class ContaSalario(
    titular: Cliente,
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