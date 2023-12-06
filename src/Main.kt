//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке. На вход подается, например,
// строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу

fun main() {
    val input = "AAADSSSRRTTHAAAA"
    var result = ""
    var count = 1

    for (i in 0 until input.length - 1) {
        if (input[i] == input[i + 1]) {
            count++
        } else {
            if (count > 1) {
                result += "${input[i]}$count"
            } else {
                result += input[i]
            }
            count = 1
        }
    }

    result += if (count > 1) "${input.last()}$count" else "${input.last()}"
    println(result)
}
