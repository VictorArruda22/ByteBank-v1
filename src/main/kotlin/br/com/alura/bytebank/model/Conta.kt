package br.com.alura.bytebank.model


abstract class Conta(var titular: Cliente, val numeroConta: Int) {

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

    fun deposita(valor: Double){
        this.saldo += valor
    }

    abstract fun saca(valor: Double)


}