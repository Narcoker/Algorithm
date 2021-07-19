import java.lang.StringBuilder
import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    var n = s.nextInt()
    val result = StringBuilder("666")
    var left = -1
    var right = 0

    for (i in 1..n) {
        if (n == 1) {
            println(result)
            return
        }
        if (left % 10 != 6 && right == 0) {
            left++
        } else {
            right++
            if (right == 10) {
                right = 0
                left++
            }
        }
    }

    if (right == 0) {
        result.insert(0, left)
        if (left % 10 == 6) result[result.length - 1] = '0'
    } else {
        result.deleteCharAt(0)
        result.insert(0, left)
        result.append(right)
    }

    println(result)
}