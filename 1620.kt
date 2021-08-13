import java.util.*
import kotlin.collections.HashMap

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val token = StringTokenizer(br.readLine())

    val n = Integer.parseInt(token.nextToken())
    val m = Integer.parseInt(token.nextToken())

    val hash1 = HashMap<String, String>() //이름 저장
    val hash2 = HashMap<String, String>() // 숫자 저장

    for (i in 1..n) {
        val input = br.readLine()
        hash1.put(i.toString(), input)
        hash2.put(input, i.toString())
    }

    for (i in 1..m) {
        val question = br.readLine()
        if (question[0] in 'A'..'Z') { //이름이면
            bw.write("${hash2[question]}\n")
        } else { // 숫자면
            bw.write("${hash1[question]}\n")
        }
    }

    bw.close()
    br.close()
}