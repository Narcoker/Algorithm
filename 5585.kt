import java.util.*

fun main(args: Array<String>) {
    var coin = arrayOf(500, 100, 50, 10, 5, 1)
    val s: Scanner = Scanner(System.`in`)
    val cost = s.nextInt()
    var remain = 1000 - cost
    var result = 0

    for (i in coin.indices) {
        if (remain < coin[i])
            continue

        result += remain / coin[i]
        remain = remain % coin[i]
    }

    println(result)

}