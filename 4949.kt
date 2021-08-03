import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val st = Stack<Char>()
    var str: String = ""

    loop@ while (true) {
        st.clear()
        str = br.readLine()
        if (str == ".") break

        for (i in str.indices) {
            if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
                st.push(str[i])
            } else if (str[i] == ')') {
                if (st.isEmpty() || st.last() != '(') {
                    bw.write("no\n")
                    continue@loop
                } else {
                    st.pop()
                }
            } else if (str[i] == '}') {
                if (st.isEmpty() || st.last() != '{' ) {
                    bw.write("no\n")
                    continue@loop
                } else {
                    st.pop()
                }
            } else if (str[i] == ']') {
                if (st.isEmpty() || st.last() != '[' ) {
                    bw.write("no\n")
                    continue@loop
                } else {
                    st.pop()
                }
            }
        }

        if (st.isEmpty()) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }

    br.close()
    bw.close()
}