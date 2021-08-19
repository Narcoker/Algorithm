package baekjoon_1167

import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

var table: Array<ArrayList<Pair<Int, Int>>>? = null
var isvisited: Array<Boolean>? = null

var max_v = 0
var max = 0
fun main() {
    val n = br.readLine().toInt()

    table = Array(n + 1) { ArrayList() }
    isvisited = Array(n + 1) { false }

    var start = 0
    var end = 0
    var weight = 0
    for (i in 1..n) {
        var token = br.readLine().split(" ")
        start = token[0].toInt()
        for (k in 1 until token.size - 2 step 2) {
            end = token[k].toInt()
            weight = token[k + 1].toInt()
            table!![start].add(Pair(end, weight))
        }
    }

    dfs(1, 0)
    isvisited!!.fill(false)

    dfs(max_v, 0)

    bw.write("$max")

    bw.close()
    br.close()
}


fun dfs(v: Int, sum: Int){
    isvisited!![v] = true

    if(sum > max){
        max = sum
        max_v = v
    }

    for(i in table!![v].indices){
        if(!isvisited!![table!![v][i].first]){
            dfs(table!![v][i].first, sum + table!![v][i].second)
        }
    }
}