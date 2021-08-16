package baekjoon_4963

import java.util.*

var table = Array(50) { Array(50) { 0 } }
var visited = Array(50) { BooleanArray(50) { false } }

var x = 0
var y = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var count = 0

    while (true) {
        var token = StringTokenizer(br.readLine())
        x = token.nextToken().toInt()
        y = token.nextToken().toInt()

        if (y == 0 && x == 0) break

        for (i in 0 until y) {
            token = StringTokenizer(br.readLine())
            for (k in 0 until x) {
                table[i][k] = token.nextToken().toInt()
            }
        }

        for (i in 0 until y) {
            for (k in 0 until x) {
                if (table[i][k] == 1 && !visited[i][k]) {
                    dfs_4963(i, k)
                    count++
                }
            }
        }

        bw.write("$count\n")
        count = 0
        for (i in 0 until y) {
            for (k in 0 until x) {
                table[i][k] = 0
                visited[i][k] = false
            }
        }
    }

    br.close()
    bw.close()
}

fun dfs_4963(i: Int, k: Int) {
    visited[i][k] = true
    if ((i - 1 >= 0 && i - 1 < y) && (k - 1 >= 0 && k - 1 < x)) {
        if (!visited[i - 1][k - 1] && table[i - 1][k - 1] == 1)
            dfs_4963(i - 1, k - 1)
    }
    if ((i - 1 >= 0 && i - 1 < y) && (k >= 0 && k < x)) {
        if (!visited[i - 1][k] && table[i - 1][k] == 1)
            dfs_4963(i - 1, k)
    }
    if ((i - 1 >= 0 && i - 1 < y) && (k + 1 >= 0 && k + 1 < x)) {
        if (!visited[i - 1][k + 1] && table[i - 1][k + 1] == 1)
            dfs_4963(i - 1, k + 1)
    }
    if ((i >= 0 && i < y) && (k - 1 >= 0 && k - 1 < x)) {
        if (!visited[i][k - 1] && table[i][k - 1] == 1)
            dfs_4963(i, k - 1)
    }
    if ((i >= 0 && i < y) && (k + 1 >= 0 && k + 1 < x)) {
        if (!visited[i][k + 1] && table[i][k + 1] == 1)
            dfs_4963(i, k + 1)
    }
    if ((i + 1 >= 0 && i + 1 < y) && (k - 1 >= 0 && k - 1 < x)) {
        if (!visited[i + 1][k - 1] && table[i + 1][k - 1] == 1)
            dfs_4963(i + 1, k - 1)
    }
    if ((i + 1 >= 0 && i + 1 < y) && (k >= 0 && k < x)) {
        if (!visited[i + 1][k] && table[i + 1][k] == 1)
            dfs_4963(i + 1, k)
    }
    if ((i + 1 >= 0 && i + 1 < y) && (k + 1 >= 0 && k + 1 < x)) {
        if (!visited[i + 1][k + 1] && table[i + 1][k + 1] == 1)
            dfs_4963(i + 1, k + 1)
    }

}