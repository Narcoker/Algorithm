package baekjoon_11660

import java.io.BufferedReader
import java.io.BufferedWriter
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
        for (k in 1..n) {
            input = token.nextToken().toInt()
            arr[i][k] = input + arr[i-1][k] + arr[i][k-1] - arr[i-1][k-1]
        }
    }

    var y1: Int
    var x1: Int
    var y2: Int
    var x2: Int
    var result: Int
    repeat(m) {
        token = StringTokenizer(br.readLine(), " ")
        x1 = Integer.parseInt(token.nextToken())
        y1 = Integer.parseInt(token.nextToken())
        x2 = Integer.parseInt(token.nextToken())
        y2 = Integer.parseInt(token.nextToken())

        result= arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1]


        bw.write("$result\n")
    }

    bw.close()
    br.close()
}