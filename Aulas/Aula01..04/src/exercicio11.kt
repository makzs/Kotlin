fun main(){

    var arrayNormal = arrayOf("elemento1", "elemento2", "elemento3")
    var arrayInvertido = arrayOf("", "", "")

    for ((indice, array) in arrayNormal.withIndex())
    {
       arrayInvertido[(arrayNormal.size - 1) - indice] = array
    }

    for (arrayI in arrayInvertido)
    {
        print(" ${arrayI}")
    }

}


