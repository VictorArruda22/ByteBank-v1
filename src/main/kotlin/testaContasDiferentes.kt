fun testaContasDiferentes() {
    println("Bem vindo ao ByteBank")

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Clara",
        numeroConta = 1002
    )

    val contaSalario = ContaSalario(
        titular = "Santos",
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

    contaCorrente.transfere(40.0, contaPoupanca)

    println("Valor poupança após transferência: ${contaPoupanca.saldo}")
}