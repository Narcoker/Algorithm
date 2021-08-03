fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()

    val arr = Array(41) { Array(2) { 0 } }

    for (i in 0..40) {
        if (i == 0) {
            arr[i][0] = 1
            arr[i][1] = 0
        } else if (i == 1) {
            arr[i][0] = 0
            arr[i][1] = 1
        } else {
            arr[i][0] = arr[i - 2][0] + arr[i - 1][0]
            arr[i][1] = arr[i - 2][1] + arr[i - 1][1]
        }
    }

    var input: Int

    repeat(n) {
        input = br.readLine().toInt()
        bw.write("${arr[input][0]} ${arr[input][1]}\n")
    }

    br.close()
    bw.close()

}