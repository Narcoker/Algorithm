package baekjoon_15654

import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n: Int? = null
var m: Int? = null

var num: Array<Int>? = null
var isvisited: Array<Boolean>? = null
var result: Array<Int>? = null
fun main() {
    var token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    num = Array(n!! + 1) { 0 }
    isvisited = Array(n!! + 1) { false }
    result = Array(m!! + 1) { 0 }

    token = StringTokenizer(br.readLine())
    for (i in 1..n!!) {
        num!![i] = token.nextToken().toInt()
    }
    num!!.sort()

    bt(1)

    br.close()
    bw.close()
}

fun bt(count: Int) {
    if (count > m!!) {
        for (i in 1..m!!)
            bw.write("${result!![i]} ")
        bw.newLine()
        return
    }

    for (i in 1..n!!) {
        if (!isvisited!![i]) {
            isvisited!![i] = true
            result!![count] = num!![i]
            bt(count + 1)
            isvisited!![i] = false
        }
    }
}