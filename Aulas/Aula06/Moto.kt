package Aula06

class Moto(modelo: String): Veiculo(modelo) {
    override fun ligarMotor()
    {
        println("vreeeeeeeeeem")
    }
}

fun main(){
    val moto1 = Moto("XRE")
    moto1.ligarMotor()
}