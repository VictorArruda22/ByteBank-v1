import model.Analista
import model.CalculadoraBonificacao
import model.Diretor
import model.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome ${alex.nome}")
    println("Cpf ${alex.cpf}")
    println("Salário ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")

    val Fran: Gerente = Gerente(
        nome = "Fran",
        cpf = "112.145.122-12",
        salario = 3000.0,
        senha = 1234
    )

    println("Nome ${Fran.nome}")
    println("Cpf ${Fran.cpf}")
    println("Salário ${Fran.salario}")
    println("Bonificação ${Fran.bonificacao()}")

    if (Fran.autentica(senha = 1234)) {
        println("Autenticou com sucesso.")
    } else {
        println("Falha na autenticação.")
    }

    val Victor: Diretor = Diretor(
        nome = "Victor",
        cpf = "542.145.122-12",
        salario = 6000.0,
        senha = 9207,
        plr = 1000.0
    )

    println("Nome ${Victor.nome}")
    println("Cpf ${Victor.cpf}")
    println("Salário ${Victor.salario}")
    println("Bonificação ${Victor.bonificacao()}")
    println("Plr ${Victor.plr}")

    if (Victor.autentica(senha = 9207)) {
        println("Autenticou com sucesso.")
    } else {
        println("Falha na autenticação.")
    }

    val Carlos: Analista = Analista(
        nome = "Carlos",
        cpf = "254.254.254-15",
        salario = 1000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(Fran)
    calculadora.registra(Victor)
    calculadora.registra(Carlos)

    println("Total de bonificação é: ${calculadora.total}")
}