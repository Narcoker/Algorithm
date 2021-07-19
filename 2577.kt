import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val input = Array(3) { 0 }
    var mul = 1;

    for (i in input.indices) {
        input[i] = s.nextInt()
        mul *= input[i]
    }

    val result = mul.toString()
    var num = Array(10) { 0 }

    for (i in result.indices)
        num[Integer.parseInt(result[i].toString())]++

    for (i in num.indices)
        println(num[i])
}
