package br.com.alura.bytebank.model

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
): Conta(
    titular = titular,
    numeroConta = numeroConta
), Transfere {
    override fun saca(valor: Double) {
        if (this.saldo >= valor){
            this.saldo -= valor
        }
    }
    override fun transfere(valor: Double, destino: Conta): Boolean{
        if (saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        println("Valor indisponivel para transferência.")
        return false
    }

}