import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.*

private class Static {
    var br: BufferedReader = System.`in`.bufferedReader()
    var bw: BufferedWriter = System.`out`.bufferedWriter()
    var n: Int? = null
    var m: Int? = null
    var isvisited: Array<Boolean>? = null
    var result: Array<Int>? = null
}

fun main() {
    val st = Static()

    var token = StringTokenizer(st.br.readLine())
    st.n = token.nextToken().toInt()
    st.m = token.nextToken().toInt()

    st.isvisited = Array(((st.n!!) + 1)!!) { false }
    st.result = Array((st.m!!) + 1) { 0 }

    bt(st, 1)

    st.br.close()
    st.bw.close()

}

private fun bt(st: Static, count: Int) {
    if (count > st.m!!) {
        for (i in 1..st.m!!)
            st.bw.write("${st.result!![i]} ")
        st.bw.newLine()
        return
    }

    for (i in 1..st.n!!) {
        if (!st.isvisited!![i] && i > st.result!![count - 1]) {
            st.isvisited!![i] = true
            st.result!![count] = i
            bt(st, count + 1)
            st.isvisited!![i] = false
        }
    }
}