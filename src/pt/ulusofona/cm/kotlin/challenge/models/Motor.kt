package pt.ulusofona.cm.kotlin.challenge.models

class Motor(cavalos : Int = 0, cilindrada : Int = 0){
     var cavalos = cavalos
     var cilindrada = cilindrada
     var ligado = false



     override fun toString(): String {
          return "Motor | $cavalos | $cilindrada"
     }
}