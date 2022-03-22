abstract class Conta(var titular: String, val numeroConta: Int) {

    var saldo = 0.0
        protected set

    //init {
    //  utilizado para execução de um trecho de código
    //  durante a execução do construtor.
    // }

    fun deposita(valor: Double){
        this.saldo += valor
    }

    abstract fun saca(valor: Double)


}