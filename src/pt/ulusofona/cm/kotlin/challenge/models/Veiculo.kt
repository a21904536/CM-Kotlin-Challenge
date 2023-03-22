package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

abstract class Veiculo(identificador : String) {
    var identificador = identificador
    var posicao : Posicao = Posicao()
    var dataDeAquisicao : Date = Date()
    abstract fun requerCarta () : Boolean





}