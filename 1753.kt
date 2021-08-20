package baekjoon_1753

import java.util.*
import kotlin.collections.ArrayList

var br = System.`in`.bufferedReader()
var bw = System.`out`.bufferedWriter()

data class Pair(val first: Int, val second: Int) : Comparable<Pair> {
    override fun compareTo(other: Pair): Int = second - other.second
}

val INF = 10000000
var table: ArrayList<ArrayList<Pair>>? = null
var cost: Array<Int>? = null
val q = PriorityQueue<Pair>()

var n = 0
var m = 0
fun main() {
    var token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    val start_v = br.readLine().toInt() - 1

    table = ArrayList()
    for(i in 1 .. n) table!!.add(ArrayList())

    cost = Array(n) { INF }


    var start = 0
    var end = 0
    var weight = 0
    for (i in 1..m) {
        token = StringTokenizer(br.readLine())
        start = token.nextToken().toInt() -1
        end = token.nextToken().toInt() -1
        weight = token.nextToken().toInt()

        table!![start].add(Pair(end, weight))
    }

    dikjstra(start_v)

    cost!!.forEach{
        if(it == INF) bw.write("INF\n")
        else bw.write("$it\n")
    }

    bw.close()
    br.close()

}


fun dikjstra(v: Int) {
    cost!![v] = 0

    q.add(Pair(v, 0))

    var cur = 0
    var distance = 0
    var next = 0
    var next_distance = 0
    while (q.isNotEmpty()) {
        cur = q.first().first
        distance = q.first().second
        q.poll()

        if (cost!![cur] < distance) continue
        for (i in 0 until table!![cur].size) {
            next = table!![cur][i].first
            next_distance = distance + table!![cur][i].second

            if (next_distance < cost!![next]) {
                cost!![next] = next_distance
                q.add(Pair(next, next_distance))
            }
        }
    }
}