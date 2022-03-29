fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Seu saldo, está positivo !")
        saldo == 0.0 -> println("Seu saldo, está neutro.")

        else -> {
            println("Seu saldo é negativo.")
        }
    }

    if (saldo > 0.0) {
        println("Eba, Seu saldo está positivo !")
    } else if (saldo == 0.0) {
        println("Seu saldo está neutro.")
    } else {
        println("Poxa, seu saldo está negativo.")
    }

}