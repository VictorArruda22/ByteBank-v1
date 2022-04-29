package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
): Conta(
    titular = titular,
    numeroConta = numeroConta
), Autenticavel, Transfere {
    override fun saca(valor: Double) {
        if (this.saldo >= valor){
            this.saldo -= valor
        }
    }
     override fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }

}