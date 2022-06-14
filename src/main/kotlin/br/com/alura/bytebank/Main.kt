import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.teste.testaAny


fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste(){
    println("executa teste")
}

class Teste: () -> Unit{
    override fun invoke() {
        TODO("Not yet implemented")
    }

}