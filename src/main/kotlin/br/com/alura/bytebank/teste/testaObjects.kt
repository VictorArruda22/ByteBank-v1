package br.com.alura.bytebank.model

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 2)
    val contaPoupanca = ContaPoupanca(titular = alex, numeroConta = 1000)
    val contaCliente = ContaCorrente(titular = alex, numeroConta = 1001)

    println("Total de contas: ${Conta.total}")
}
