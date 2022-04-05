package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.Autenticavel
import br.com.alura.bytebank.model.Funcionario

abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
     protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}