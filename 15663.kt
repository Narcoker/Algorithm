package baekjoon_15663

import java.util.*
import kotlin.collections.HashSet

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n: Int? = null
var m: Int? = null

var num: Array<Int>? = null
var isvisited: Array<Boolean>? = null
var result: Array<Int>? = null
var pre_result: Array<Int>? = null
var result_box: HashSet<Array<Int>>? = null


fun main() {
    var token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    num = Array(n!! + 1) { 0 }
    isvisited = Array(n!! + 1) { false }
    result = Array(m!! + 1) { 0 }
    pre_result = Array(m!! + 1) { 0 }
    result_box = HashSet()

    token = StringTokenizer(br.readLine())
    for (i in 1..n!!)
        num!![i] = token.nextToken().toInt()

    num!!.sort()

    bt(1)

    bw.close()
    br.close()
}

fun bt(count: Int) {
    if (count > m!!) {
        for (i in 1..m!!)
            bw.write("${result!![i]} ")
        bw.newLine()
        return
    }

    var pre = 0

    for (i in 1..n!!) {
        if (!isvisited!![i] && num!![i] != pre) {
            pre = num!![i]
            isvisited!![i] = true
            result!![count] = num!![i]
            bt(count + 1)
            isvisited!![i] = false
        }
    }
}
