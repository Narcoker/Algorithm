import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val str = s.nextLine()
    var arr = Array(26) { -1 }

    for (i in str.indices) {
        var index = str[i].toInt() - 97 // 알파뱃
        if (arr[index] == -1) arr[index] = i
    }

    for (i in arr.indices)
        print("${arr[i]} ")

}