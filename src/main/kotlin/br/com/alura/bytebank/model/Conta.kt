package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class Conta(var titular: Cliente, val numeroConta: Int) : Autenticavel {

    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init{
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double){
        this.saldo += valor
    }

    abstract fun saca(valor: Double)


//     fun transfere(valor: Double, destino: Conta, senha: Int) {
//        if (saldo < valor) {
//            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
//        }
//        if (!autentica(senha)){
//            throw FalhaAutenticacaoException()
//        }
//        saldo -= valor
//        destino.deposita(valor)
//    }
}