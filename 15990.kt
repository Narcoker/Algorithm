import java.math.BigInteger

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()


    val arr = Array(100001) { Array<Long>(3) { 0 } }

    for (i in 1..100000) {
        if (i == 1) {
            arr[i][0] = 1
            arr[i][1] = 0
            arr[i][2] = 0
        } else if (i == 2) {
            arr[i][0] = 0
            arr[i][1] = 1
            arr[i][2] = 0
        } else if (i == 3) {
            arr[i][0] = 1
            arr[i][1] = 1
            arr[i][2] = 1
        } else {
            arr[i][0] = (arr[i - 1][1] + arr[i - 1][2]) % 1000000009
            arr[i][1] = (arr[i - 2][0] + arr[i - 2][2]) % 1000000009
            arr[i][2] = (arr[i - 3][0] + arr[i - 3][1]) % 1000000009
        }

    }

    val n = br.readLine().toInt()

    var input: Int

    repeat(n) {
        input = br.readLine().toInt()
        bw.write("${(arr[input][0] + arr[input][1] + arr[input][2]) % 1000000009}\n")
    }

    bw.close()
    br.close()
}