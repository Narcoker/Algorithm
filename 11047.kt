import java.util.*

fun main(args: Array<String>) {
    val s: Scanner = Scanner(System.`in`)
    val N: Int = s.nextInt() // 동전종류수
    var K: Int = s.nextInt() // 만들고하자는 금액
    val coin = arrayOfNulls<Int>(N)
    var result: Int = 0
    var ptr: Int = -1

    for (i in 0 until N) {
        coin[i] = s.nextInt()
        if (coin[i]!! <= K)
            ptr++
    }

    while (K != 0) {
        result += K / coin[ptr]!!
        K %= coin[ptr--]!!
    }

    println(result)

}