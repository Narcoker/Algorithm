import java.util.*

fun main(arg: Array<String>) {
    val s: Scanner = Scanner(System.`in`)
    var n = s.nextInt()
    var arr = arrayListOf<Int>()

    for (i in 0 until n) {
        arr.add(s.nextInt())
    }

    n = s.nextInt()
    var sex: Int
    var num: Int
    var start: Int = 0
    var end: Int = 0
    var k: Int

    for (i in 0 until n) {
        sex = s.nextInt()
        num = s.nextInt()
        k = 1

        if (sex == 1) { // 남자
            while ((num * k) - 1 < arr.count()) {
                if (arr[(num * k) - 1] == 0) {
                    arr[(num * k) - 1] = 1
                } else {
                    arr[(num * k) - 1] = 0
                }
                k++
            }
        } else { // 여자
            start = num - 1
            end = num - 1

            while (start > 0 && end < arr.count() - 1) {
                if (arr[start - k] == arr[end + k]) {
                    start--
                    end++
                } else break
            }

            for (i in start..end) {
                if (arr[i] == 0) arr[i] = 1
                else arr[i] = 0
            }
        }
    }

    for (i in arr.indices) {
        print(arr[i])
        print(" ")

        if ((i + 1) % 20 == 0)
            println()
    }
}