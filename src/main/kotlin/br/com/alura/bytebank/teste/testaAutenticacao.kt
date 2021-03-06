import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.Diretor
import br.com.alura.bytebank.model.Gerente
import br.com.alura.bytebank.model.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Carla",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Cleiton",
        cpf = "123.234.345-23",
        senha = 1203
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1203)
}
