import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val s = BufferedReader(InputStreamReader(System.`in`))
    val n = s.readLine().toInt()
    var book: String
    var arr: MutableMap<String, Int> = HashMap()


    for (i in 0 until n) {
        book = s.readLine().toString()
        if (!arr.contains(book)) {
            arr.put(book, 1)
        } else
            arr.put(book, arr.getValue(book) + 1)
    }

    var sortedByValue = arr.toList().sortedWith(compareByDescending({ it.second })).toMap()

    var itr = sortedByValue.iterator()
    var result = itr.next()

    while (itr.hasNext()) {
        var temp = itr.next()
        if (result.value == temp.value && result.key.compareTo(temp.key) > 0) {
            result = temp
        }
    }

    println(result.key)
}