package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import java.util.*

class Pessoa(nome : String, dataDeNascimento: Date) {
    var nome = nome
    var dataDeNascimento = dataDeNascimento
    var veiculos : MutableList<Veiculo> = mutableListOf()
    var carta : Carta? = null
    var posicao = Posicao()

    fun comprarVeiculo(veiculo: Veiculo) {
        this.veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String) : Veiculo {
        for (veiculo in veiculos) {
            if(veiculo.identificador == identificador) {
                return veiculo
            }
        }
        throw VeiculoNaoEncontradoException()
    }


    fun venderVeiculo(identificador: String) : Veiculo { //falta acabar a funçao
        for (veiculo in veiculos) {
            if (veiculo.identificador == identificador) {
                return veiculo
            }
        }
        throw VeiculoNaoEncontradoException()
    }





    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | Posicao | x:${posicao.x} | y:${posicao.y}"
    }
}