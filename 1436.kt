import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    var first = 0
    var second = 666
    var type = false
    var max = 0
    val n = s.nextInt()

    for (i in 1..n) {
        if (i == 1)
            continue

        if (type == false) {
            first++
            if (first % 1000 == 666) {
                second = 0
                max = 1000
                type = true
            } else if (first % 100 == 66) {
                second = 600
                max = 700
                type = true
            } else if (first % 10 == 6) {
                second = 660
                max = 670
                type = true
            }
            continue
        } else if (type == true) {
            second++

            if (second == max) {
                first++
                second = 666
                type = false
            }
        } else first++
    }
    if (n != 1)
        println(String.format("%d%03d", first, second))

    else
        println(second)
}