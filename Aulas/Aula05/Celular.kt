package Aula05

class Celular(val marca: String, val modelo: String, val preco: Float ) {


    fun detalhes()
    {
        println()
        println("1.Marca: $marca")
        println("2.modelo: $modelo")
        println("3.preço: R$${"%.2f".format(preco)}")
        println()
    }


}

fun main (){
    val celular1 = Celular("Motorola", "G8", 1200.00f)
    val celular2 = Celular("Samsung","J7", 1500.00f)

    celular1.detalhes()
    celular2.detalhes()

}