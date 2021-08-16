package baekjoon_15651

import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n: Int? = null
var m: Int? = null
var isvisited: Array<Boolean>? = null
var result: Array<Int>? = null

fun main() {
    val token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    isvisited = Array(n!! + 1) { false }
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
        result!![count] = i
        bt(count + 1)
    }
}