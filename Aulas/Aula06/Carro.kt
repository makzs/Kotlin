package Aula06

class Carro(modelo: String): Veiculo(modelo) {
    override fun ligarMotor()
    {
        println("vroooooooooom")
    }
}

fun main(){
    val carro1 = Carro("fusca")
    carro1.ligarMotor()
}