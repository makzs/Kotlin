package Aula06.Exercicio01

class Carro(modelo: String): Veiculo(modelo) {
    override fun ligarMotor()
    {
        super.ligarMotor()
        println("vroooooooooom")
    }
}

fun main(){
    val carro1 = Carro("fusca")

    carro1.ligarMotor()
}