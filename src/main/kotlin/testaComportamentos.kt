fun testaComportamentos() {
    val contaCarlos = ContaPoupanca(titular = "Carlos", numeroConta = 1001)
    contaCarlos.deposita(valor = 104.0)

    println(contaCarlos.titular)
    println(contaCarlos.numeroConta)
    println(contaCarlos.saldo)
    println()

    val contaMaria = ContaCorrente(titular = "Maria", numeroConta = 2003)
    contaMaria.deposita(valor = 405.0)

    println(contaMaria.titular)
    println(contaMaria.numeroConta)
    println(contaMaria.saldo)

    println("Depositando na conta da Maria..")
    contaMaria.deposita(valor = 70.0)
    println(contaMaria.saldo)

    println("Depositando na conta do Carlos..")
    contaCarlos.deposita(valor = 400.0)
    println(contaCarlos.saldo)

    println("Sacando na conta da Maria..")
    contaMaria.saca(valor = 75.0)
    println(contaMaria.saldo)

    println("Sacando na conta do Carlos..")
    contaCarlos.saca(valor = 20.0)
    println(contaCarlos.saldo)

    println("Transferindo para a Maria")

    if (contaCarlos.transfere(valor = 100.0, destino = contaMaria)) {
        println("Transferencia realizada")
        println("Saldo atual da Maria é de: ${contaMaria.saldo}")
        println("Saldo atual do Carlos é de: ${contaCarlos.saldo}")
    } else {
        println("Falha na transferencia")
    }
}