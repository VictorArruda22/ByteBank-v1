import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca

fun testaComportamentos() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "",
        senha = 1
    )

    val contaCarlos = ContaPoupanca(titular = alex, numeroConta = 1001)
    contaCarlos.deposita(valor = 104.0)

    println(contaCarlos.titular)
    println(contaCarlos.numeroConta)
    println(contaCarlos.saldo)
    println()

    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)
    val contaMaria = ContaCorrente(titular = maria, numeroConta = 2003)
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

    try{
        contaCarlos.transfere(destino = contaMaria, valor = 200.0)
        println("Transferência realizada.")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    }

//    if (contaCarlos.transfere(valor = 100.0, destino = contaMaria)) {
//        println("Transferencia realizada")
//        println("Saldo atual da Maria é de: ${contaMaria.saldo}")
//        println("Saldo atual do Carlos é de: ${contaCarlos.saldo}")
//    } else {
//        println("Falha na transferencia")
//    }
}