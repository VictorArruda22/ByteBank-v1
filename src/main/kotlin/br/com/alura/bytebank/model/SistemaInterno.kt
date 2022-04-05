package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank, você autenticou com sucesso !")
        }
        else{
            println("Erro na autenticação")
        }
    }
}