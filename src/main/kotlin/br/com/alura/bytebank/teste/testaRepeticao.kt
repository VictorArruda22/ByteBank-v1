fun testaRepeticao(saldo: Double) {

    var i = 0
    while (i < 5) {
        val titular = "Junior"
        val numeroConta = 4256 + i
        var saldo = i + 100.0


        println("Titular $titular")
        println("Sua conta é $numeroConta")
        println("Seu saldo atual é de $saldo")
        println()

        testaCondicoes(saldo)
        println()
        i++
    }

    for (i in 8 downTo 1 step 2) {
        val titular = "Junior"
        val numeroConta = 4256 - i
        var saldo = i - 100.0


        println("Titular $titular")
        println("Sua conta é $numeroConta")
        println("Seu saldo atual é de $saldo")
        println()

        if (saldo == -94.0) {
            break
        }
        testaCondicoes(saldo)
        println()
    }
}