package  baekjoon_15652

import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n: Int? = null
var m: Int? = null

var result: Array<Int>? = null

fun main() {
    val token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    result = Array(m!! + 1) { 0 }

    bt(1)

    bw.close()
    br.close()
}

fun bt(count: Int) {
    if (count > m!!) {
        for (i in 1..m!!) {
            bw.write("${result!![i]} ")
        }
        bw.newLine()
        return
    }

    for (i in 1..n!!) {
        if (result!![count-1] <= i) {
            result!![count] = i
            bt(count + 1)
        }
    }
}