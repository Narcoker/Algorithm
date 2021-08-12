import java.util.*

var visited_11725 = Array(100001) { -1 }

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
    visited_11725[start] = 0

    var cur: Int
    while (true) {
        cur = q.poll()

        if (cur == end)
            return visited_11725[cur]

        var back = cur - 1
        var go = cur + 1
        var jump = cur * 2

        if (back >= 0 && visited_11725[back] == -1) {
            q.add(back)
            visited_11725[back] = visited_11725[cur] + 1
        }
        if (go <= 100000 && visited_11725[go] == -1) {
            q.add(go)
            visited_11725[go] = visited_11725[cur] + 1
        }
        if (jump <= 100000 && visited_11725[jump] == -1) {
            q.add(jump)
            visited_11725[jump] = visited_11725[cur] + 1
        }
    }
}
