package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado:() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank, você autenticou com sucesso !")
            autenticado()
        }
        else{
            println("Erro na autenticação")
        }
    }
}