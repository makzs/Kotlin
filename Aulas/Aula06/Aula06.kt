package Aula06

class Aula06 {
}

// classe abstrata
abstract class Forma{
    abstract fun calcularArea() : Double
}

class Circulo(val raio: Float) : Forma(){
    override fun calcularArea() : Double{
        return Math.PI * raio * raio
    }
}

class Retangulo(val largura: Double, val altura: Double) : Forma(){
    override fun calcularArea() : Double{
        return largura * altura
    }
}

interface Trabalhar {
    fun trabalhar()
}

class Engenheiro : Trabalhar{
    override fun trabalhar() {
        println("Montando a casa")
    }
}

class Professor : Trabalhar{
    override fun trabalhar() {
        println("Dando Aula")
    }
}

fun main()
{
    val c = Circulo(9f)
    val r = Retangulo(10.0, 20.0)

    println("Area do circulo: " + c.calcularArea())
    println("Area do retangulo: " + r.calcularArea())

}
