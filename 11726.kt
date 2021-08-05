fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = Array<Long>(1001) { 0 }

    val input = br.readLine().toInt()

    for (i in 1 .. 1000) {
        if (i == 1) arr[i] = 1
        else if (i == 2) arr[i] = 2
        else arr[i] = (arr[i - 2] + arr[i - 1]) % 10007
    }

    bw.write("${arr[input]}")

    bw.close()
    br.close()

}