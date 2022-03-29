package model

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }

//    fun registra(diretor: model.Diretor){
//        this.total += diretor.bonificacao()
//    }
//
//    fun registra(gerente: model.Gerente){
//        this.total += gerente.bonificacao()
//    }
}