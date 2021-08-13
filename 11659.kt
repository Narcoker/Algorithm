import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())

    var n = Integer.parseInt(token.nextToken())
    var m = Integer.parseInt(token.nextToken())

    val arr = Array(n + 1) { 0 }

    token = StringTokenizer(br.readLine(), " ")
    for (i in 1..n) {
        arr[i] = Integer.parseInt(token.nextToken())
        if (i != 1)
            arr[i] += arr[i - 1]
    }

    repeat(m) {
        token = StringTokenizer(br.readLine(), " ")
        n = Integer.parseInt(token.nextToken())
        m = Integer.parseInt(token.nextToken())
        bw.write("${arr[m] - arr[n - 1]}\n")
    }

    bw.close()
    br.close()
}