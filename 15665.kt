package baekjoon_15665

import java.util.*

val br = System.`in`.bufferedReader()
var bw = System.`out`.bufferedWriter()

var n = 0
var m = 0

var num: Array<Int>? = null
var result: Array<Int>? = null

fun main(){
    var token = StringTokenizer(br.readLine())
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    num = Array(n+1){0}
    result = Array(m+1){0}

    token = StringTokenizer(br.readLine())
    for(i in 1 .. n!!)
        num!![i] = token.nextToken().toInt()

    num!!.sort()

    bt(1)

    bw.close()
    br.close()
}

fun bt(count: Int){
    if(count > m){
        for(i in 1 .. m!!)
            bw.write("${result!![i]} ")
        bw.newLine()

        return
    }

    var pre = 0

    for(i in 1 .. n!!){
        if(pre != num!![i]){
            pre = num!![i]
            result!![count] = num!![i]
            bt(count + 1)
        }
    }
}