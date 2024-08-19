fun main()
{
    var arrayNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Informe o fatorial para multiplicação: ")
    val fatorial = readLine()!!.toInt()

    for ((i, num) in arrayNum.withIndex())
    {
        arrayNum[i] = num * fatorial
    }

    print(arrayNum.joinToString())
}