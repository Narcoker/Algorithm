import java.util.*


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val arr = Array(n + 1) { Array(m + 1) { 0 } }
    val cost = Array(n + 1) { Array(m + 1) { -1 } }
    for (i in 1..n) {
        val str = br.readLine()
        for (k in 1..m) {
            arr[i][k] = Integer.parseInt("${str[k - 1]}")
        }
    }

    bw.write("${bfs_2178(1, 1, arr, cost, n, m)}")

    br.close()
    bw.close()

}

fun bfs_2178(n: Int, m: Int, arr: Array<Array<Int>>, cost: Array<Array<Int>>, x: Int, y: Int): Int {
    val q: Queue<Pair<Int, Int>> = LinkedList()
    var cur: Pair<Int, Int>

    q.add(Pair(n, m))
    cost[n][m] = 1

    while (true) {
        cur = q.poll()

        if (cur.first == x && cur.second == y) return cost[x][y]

        if (cur.first - 1 in 1..x && cur.second in 1..y) { // 위
            if ((arr[cur.first - 1][cur.second] == 1) && (cost[cur.first - 1][cur.second] == -1)) {
                q.add(Pair(cur.first - 1, cur.second))
                cost[cur.first - 1][cur.second] = cost[cur.first][cur.second] + 1
            }
        }

        if (cur.first + 1 in 1..x && cur.second in 1..y) { // 아래
            if ((arr[cur.first + 1][cur.second] == 1) && (cost[cur.first + 1][cur.second] == -1)) {
                q.add(Pair(cur.first + 1, cur.second))
                cost[cur.first + 1][cur.second] = cost[cur.first][cur.second] + 1
            }
        }

        if (cur.first in 1..x && cur.second - 1 in 1..y) { // 왼쪽
            if ((arr[cur.first][cur.second - 1] == 1) && (cost[cur.first][cur.second - 1] == -1)) {
                q.add(Pair(cur.first, cur.second - 1))
                cost[cur.first][cur.second - 1] = cost[cur.first][cur.second] + 1
            }
        }

        if (cur.first in 1..x && cur.second + 1 in 1..y) { // 오른쪽
            if ((arr[cur.first][cur.second + 1] == 1) && (cost[cur.first][cur.second + 1] == -1)) {
                q.add(Pair(cur.first, cur.second + 1))
                cost[cur.first][cur.second + 1] = cost[cur.first][cur.second] + 1
            }
        }
    }
}
