package Aula06.Exercicio03

interface Veiculo2 {
    fun mover()
}

class Bicicleta(val modelo: String) : Veiculo2{
    override fun mover(){
        println("A bicicleta esta se movendo")
    }
}

class Carro(val modelo: String) : Veiculo2{
    override fun mover(){
        println("O carro esta se movendo")
    }
}

fun main(){
    val c = Carro("fusca")
    val b = Bicicleta("Vermelha")

    c.mover()
    b.mover()
}