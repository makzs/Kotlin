package Aula05
// construtores em kotlin
class carro (val marca: String, val modelo: String)
{

    // definir uma atributo privado

    private var preco : Float = 1000.0f
    /* seria igual a
    String marca;
    Carro(String marca, String modelo)
    {
        this.marca = marca
        this.modelo = modelo
    }
     */
    fun detalhes(){
        println("-->marca: $marca, -->Modelo: $modelo")
    }

    // outra maneira de construtor em kotlin
    constructor(marca: String) : this(marca, "Sem modelo")

    fun setPreco(novoPreco: Float)
    {
        preco = novoPreco
    }

    fun getPreco() : Float
    {
        return preco
    }

}


open class Animal(var nome: String)
{
    open fun fazerBarulho()
    {
        println("O animal fez um barulho...")
    }
}

// Exemplo de herança, tem que usar o open na classe pai
class Cachorro(nome: String) : Animal(nome)
{
    override fun fazerBarulho(){
        println("AuAu")
    }
}


fun main() {
    /*
    val carro1 = carro("azul", "fusca")
    carro1.detalhes()
    val carro2 = carro("vermelho")
    carro2.detalhes()
     */

    val cachorro1 = Cachorro("rex")
    println(cachorro1.nome)
    cachorro1.fazerBarulho()
}