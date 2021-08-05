import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val token = StringTokenizer(br.readLine())
    val day = token.nextToken().toInt()
    val dduk = token.nextToken().toInt()

    var left = 1
    var right = dduk - 1
    var middle: Int

    val arr = Array(day + 1) { 0 }
    var min_count = 0
    var max_count = 0
    var first_dduk = 1
    while (true) {
        middle = (left + right) / 2

        for (i in 1..day) {
            if (i == 1) arr[i] = first_dduk++
            else if (i == 2) arr[i] = middle - arr[1]
            else {
                arr[i] = arr[i - 2] + arr[i - 1]
            }
        }

        if (arr[day] > dduk && arr[1] < arr[2]) {
            max_count++
            continue
        } else if (arr[day] < dduk && arr[1] < arr[2]) {
            min_count++
            continue
        } else if (arr[day] == dduk) break

        if (max_count > min_count) {
            right = middle - 1
        } else {
            left = middle + 1
        }
        first_dduk = 1
        min_count = 0
        max_count = 0
    }

    bw.write("${arr[1]}\n${arr[2]}")

    br.close()
    bw.close()
}