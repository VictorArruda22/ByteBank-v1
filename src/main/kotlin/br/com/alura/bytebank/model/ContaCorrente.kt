package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
): Conta(
    titular = titular,
    numeroConta = numeroConta
), Autenticavel, Transfere {
    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
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


//    override fun transfere(valor: Double, destino: Conta): Boolean{
//        if (saldo >= valor){
//            saldo -= valor
//            destino.deposita(valor)
//            return true
//        }
//        println("Valor indisponivel para transferência.")
//        return false
//    }
}