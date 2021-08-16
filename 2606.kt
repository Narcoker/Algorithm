package baekjoon_2606

import java.util.*

internal var n: Int = 0
internal var m: Int = 0
internal var table: Array<IntArray> = arrayOf()
internal var visited: BooleanArray = booleanArrayOf()
internal var count = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    n = br.readLine().toInt()
    m = br.readLine().toInt()

    table = Array(n + 1) { IntArray(n + 1) { 0 } }
    visited = BooleanArray(n + 1) { false }

    var input1: Int
    var input2: Int
    repeat(m) {
        var token = StringTokenizer(br.readLine())
        input1 = token.nextToken().toInt()
        input2 = token.nextToken().toInt()
        table[input1][input2] = 1
        table[input2][input1] = 1
    }

    dfs_2606(1)

    bw.write("$count")

    bw.close()
    br.close()
}

fun dfs_2606(v: Int) {
    visited[v] = true
    for (i in 1..n) {
        if (!visited[i] && table[v][i] == 1) {
            count++
            dfs_2606(i)
        }
    }
}