import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())

    val n = Integer.parseInt(token.nextToken())
    val m = Integer.parseInt(token.nextToken())

    val arr = Array(n + 1) { Array(n + 1) { 0 } }

    var input: Int
    for (i in 1..n) {
        token = StringTokenizer(br.readLine())
        for (k in 0..n) {
            if (i == 1 && k == 0) continue

            input = token.nextToken().toInt()

            if(i == 1 && k == 1) arr[i][k] = input

            else if (i >= 1 && k == 0)
                arr[i][k] = arr[i - 1][n]
            else
                arr[i][k] = input + arr[i][k - 1]
        }
    }

    var start_x: Int
    var start_y: Int
    var end_x: Int
    var end_y: Int
    repeat(m) {
        token = StringTokenizer(br.readLine(), " ")
        start_x = Integer.parseInt(token.nextToken())
        start_y = Integer.parseInt(token.nextToken())
        end_x = Integer.parseInt(token.nextToken())
        end_y = Integer.parseInt(token.nextToken())

        if(start_x == 0 && start_y != 0){
            start_y--
            start_x = n
        }


    }
}