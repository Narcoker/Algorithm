import java.util.*

internal val br = System.`in`.bufferedReader()
internal val bw = System.`out`.bufferedWriter()

internal var n: Int = 0
internal var m: Int = 0
internal var isvisited: Array<Boolean>? = null
internal var num: Array<Int>? = null

fun main() {
    val token = StringTokenizer(br.readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    isvisited = Array(n + 1) { false }
    num = Array<Int>(m+1){0}

    bt(1)

    bw.close()
    br.close()
}

fun bt(count: Int){
    if(count > m) {
        for (i in 1..m) {
            bw.write("${num!![i]} ")
        }
        bw.newLine()
        return
    }

    for( i in 1.. n){
        if(isvisited!![i]){
            continue
        }
        isvisited!![i] = true
        num!![count] = i
        bt(count + 1)
        isvisited!![i] = false
    }
}