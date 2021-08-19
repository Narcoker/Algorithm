package baekjoon_1967

import java.util.*
import kotlin.collections.ArrayList

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var n = 0
var table: Array<ArrayList<Pair<Int, Int>>>? = null
var isvisited: Array<Boolean>? = null
var max = 0
var max_idx =0

fun main() {
    n = br.readLine().toInt()

    table = Array(n + 1) { ArrayList() }
    isvisited = Array(n + 1) { false }


    for (i in 1 until n) {
        var token = StringTokenizer(br.readLine())
        var x = Integer.parseInt(token.nextToken())
        var y = Integer.parseInt(token.nextToken())
        var weight = Integer.parseInt(token.nextToken())

        table!![x].add(Pair(y, weight))
        table!![y].add(Pair(x, weight))
    }

    dfs(1, 0)

    isvisited!!.fill(false)
    dfs(max_idx, 0)

    bw.write("$max")

    bw.close()
    br.close()
}

fun dfs(v: Int, sum: Int) {
    if (max < sum) {
        max = sum
        max_idx = v
    }

    isvisited!![v] = true
    for (i in table!![v].indices) {
        if (!isvisited!![table!![v][i].first]) {
            dfs(table!![v][i].first, sum + table!![v][i].second)
        }
    }



}