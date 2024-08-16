fun main()
{
    var valor = 0
    var cont = 0

    for (i in 0..4)
    {
        print("Num ${i+1}: ")
        valor = readLine()!!.toInt()

        cont += valor
    }

    println("A soma dos valores é ${cont}")
}