import br.com.alura.bytebank.model.*

fun testaContasDiferentes() {
    println("Bem vindo ao ByteBank")

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 22,
            endereco = Endereco(logradouro = "Avenida reseda")
        ),
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Carlos",
            cpf = "",
            senha = 22
        ),
        numeroConta = 1002
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Santos",
            cpf = "",
            senha = 22
        ),
        numeroConta = 2003
    )

    contaCorrente.deposita(100.0)
    contaPoupanca.deposita(200.0)
    contaSalario.deposita(1000.0)

    println("Valor após deposito: ${contaCorrente.saldo}")
    println("Valor após deposito: ${contaPoupanca.saldo}")
    println("Valor após deposito: ${contaSalario.saldo}")

    contaCorrente.saca(50.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(800.0)

    println("Valor após saque: ${contaCorrente.saldo}")
    println("Valor após saque: ${contaPoupanca.saldo}")
    println("Valor após saque: ${contaSalario.saldo}")

    contaCorrente.transfere(40.0, contaPoupanca, senha = 22)

    println("Valor poupança após transferência: ${contaPoupanca.saldo}")

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro}")

}