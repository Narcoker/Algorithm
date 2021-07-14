import java.util.*

fun main(args: Array<String>) {
    val N: Int = readLine()!!.toInt()
    var result:Int= 0
    val time = arrayOfNulls<Int>(N)
    val s: Scanner = Scanner(System.`in`)
    var temp:Int = 0

    for (i in 0 until N)
        time[i] = s.nextInt()

    time.sort()

    for (i in 0 until N) {
        temp += time[i]!!
        result += temp
    }

    println(result)
}