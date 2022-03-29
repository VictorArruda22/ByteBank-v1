import model.ContaCorrente

fun testaCopiaEReferencias() {

    val contaJao = ContaCorrente(titular = "Jão", numeroConta = 2451)
    val contaPaula = contaJao
    contaPaula.titular = "Paulinha"

    println("nome do titular: ${contaPaula.titular}")
    println("nome do titular: ${contaJao.titular}")

    val numeroX = 0
    var numeroY = numeroX
    numeroY++

    println(numeroY)
    println(numeroX)

}