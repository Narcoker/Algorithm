import java.util.*

var visited_1697 = Array(100001) { -1 }

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val token = StringTokenizer(br.readLine())
    var start = token.nextToken().toInt()
    var end = token.nextToken().toInt()

    val result = bfs_11725(start, end)
    bw.write("$result")
    br.close()
    bw.close()
}

fun bfs_11725(start: Int, end: Int): Int {
    val q: Queue<Int> = LinkedList<Int>()
    var stair_end = start
    var count = 0
    q.add(start)
    visited_1697[start] = 0

    var cur: Int
    while (true) {
        cur = q.poll()

        if (cur == end)
            return visited_1697[cur]

        var back = cur - 1
        var go = cur + 1
        var jump = cur * 2

        if (back >= 0 && visited_1697[back] == -1) {
            q.add(back)
            visited_1697[back] = visited_1697[cur] + 1
        }
        if (go <= 100000 && visited_1697[go] == -1) {
            q.add(go)
            visited_1697[go] = visited_1697[cur] + 1
        }
        if (jump <= 100000 && visited_1697[jump] == -1) {
            q.add(jump)
            visited_1697[jump] = visited_1697[cur] + 1
        }
    }
}
