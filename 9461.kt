fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = Array<Long>(101) { 0 }

    for (i in 1..100) {
        if (i == 1 || i == 2 || i == 3) arr[i] = 1
        else arr[i] = arr[i - 3] + arr[i - 2]
    }

    val n = br.readLine().toInt()
    var input: Int

    repeat(n){
        input = br.readLine().toInt()
        bw.write("${arr[input]}\n")
    }

    br.close()
    bw.close()
}