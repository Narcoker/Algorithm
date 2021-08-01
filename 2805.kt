import java.math.BigInteger
import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val arr = Array<Long>(n) { 0 }
    var sum: BigInteger

    token = StringTokenizer(br.readLine())

    for (i in arr.indices) {
        arr[i] = token.nextToken().toLong()
    }

    arr.sort()

    var min: Long = 0
    var max: Long = arr[n - 1]
    var mid : Long
    while (true) {
        var sum: Long = 0
        mid = (min + max) / 2

        if (min > max) {
            bw.write("$mid")
            bw.flush()
            return
        }

        for (i in arr.indices) {
            if (arr[i] - mid > 0)
                sum += arr[i] - mid
        }

        if (sum > m) {
            min = mid + 1
        } else if (sum < m) {
            max = mid - 1
        } else {
            bw.write("$mid")
            bw.flush()
            return
        }
    }
}