import java.util.*

fun main(args: Array<String>) {
    val s: Scanner = Scanner(System.`in`)
    val input = s.nextLine()
    val num = input.split("-", "+")
    var result: Int = num[0].toInt()
    var i = 1
    var isplus = false
    for (k in input) {
        if (k == '+') {
            result += num[i++].toInt()
            isplus = true
        } else if (k == '-') {
            break
        }
    }

    for (k in i until num.count()) {
        result -= num[k].toInt()
    }

    println(result)
}