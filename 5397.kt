import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = Integer.parseInt(br.readLine())

    var input: String
    repeat(n) {
        input = br.readLine()

        var pre = Stack<Char>()
        var post = Stack<Char>()

        for (i in input.indices) {
            if (input[i] == '<') {
                if (pre.isNotEmpty())
                    post.push(pre.pop())
            } else if (input[i] == '>') {
                if (post.isNotEmpty())
                    pre.push(post.pop())
            } else if (input[i] == '-') {
                if (pre.isNotEmpty())
                    pre.pop()
            } else { // 문자
                pre.push(input[i])
            }
        }

        for (i in pre.indices)
            post.push(pre.pop())

        for (i in post.indices)
            bw.write("${post.pop()}")

        bw.write("\n")
    }
    bw.close()
    br.close()
}