package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(nome: String, message: String ="$nome não tem carta para conduzir o veículo indicado") : Exception(message) {
}