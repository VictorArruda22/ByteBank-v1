import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente

fun testaCopiaEReferencias() {

    val joao = Cliente(nome = "João", cpf = "", senha = 3)
    val contaJao = ContaCorrente(titular = joao, numeroConta = 2451)
    val contaPaula = contaJao
    contaPaula.titular.nome = "João"

    println("nome do titular: ${contaPaula.titular.nome}")
    println("nome do titular: ${contaJao.titular.nome}")

    val numeroX = 0
    var numeroY = numeroX
    numeroY++

    println(numeroY)
    println(numeroX)

}