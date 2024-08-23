package Aula06.Exercicio02

abstract class Funcionario {
    abstract fun calcularBonus() : Double
}

class Programador(val salario: Double) : Funcionario(){
    override fun calcularBonus() : Double{
        return salario + ((salario * 10) / 100)
    }
}

class Gerente(val salario: Double) : Funcionario(){
    override fun calcularBonus() : Double{
        return salario + ((salario * 20) / 100)
    }
}

fun main(){
    val p = Programador(3200.0)
    val g = Gerente(6200.0)

    println("Salario do programador: ${p.salario}")
    println("Salario do programador com o bonus: ${p.calcularBonus()}")
    println("Salario do gerente: ${g.salario}")
    println("Salario do gerente com o bonus: ${g.calcularBonus()}")
}