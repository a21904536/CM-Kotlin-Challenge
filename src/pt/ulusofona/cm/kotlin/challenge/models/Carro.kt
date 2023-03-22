package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador : String, motor : Motor){

     var cavalos = motor.cavalos
     var cilindrada = motor.cilindrada
     var ligado = false



    override fun toString(): String {
        return "Carro | "
    }
}