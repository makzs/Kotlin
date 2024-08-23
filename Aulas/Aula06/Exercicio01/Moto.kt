package Aula06.Exercicio01

class Moto(modelo: String): Veiculo(modelo) {
    override fun ligarMotor()
    {
        super.ligarMotor()
        println("vreeeeeeeeeem")
    }
}

fun main(){
    val moto1 = Moto("XRE")
    moto1.ligarMotor()
}