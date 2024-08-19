package Aula05

class Funcionario(val nome: String) {
    private var salario: Float = 0f

    fun setSalario(novoSalario: Float)
    {
        if(novoSalario > 0)
        {
            salario = novoSalario
        }
        else{
            println("O salario deve ser positivo")
        }
    }

    fun exibirSalario()
    {
        println("Nome: ${nome}")
        println("Salario: ${salario}")
    }
}

fun main()
{
    val funcionario1 = Funcionario("Jorge")

    funcionario1.setSalario(2000f)

    funcionario1.exibirSalario()
}