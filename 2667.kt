var count_2667 = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array(n + 1) { Array(n + 1) { 0 } }
    val visited = Array(n + 1) { Array(n + 1) { false } }
    for (i in 1..n) {
        val input = br.readLine()
        for (k in 1..n) {
            arr[i][k] = Integer.parseInt("${input[k - 1]}")
        }
    }

    var result = ArrayList<Int>()
    for (i in 1..n) {
        for (k in 1..n) {
            if (!visited[i][k] && arr[i][k] == 1) {
                count_2667++
                dfs_2667(i, k, n, arr, visited, result)
                result.add(count_2667)
                count_2667 = 0
            }
        }
    }

    bw.write("${result.size}\n")
    result.sort()
    for(i in result.indices){
        bw.write("${result[i]}\n")
    }

    bw.close()
    br.close()
}

fun dfs_2667(i: Int, k:Int, n: Int, arr: Array<Array<Int>>, visited: Array<Array<Boolean>>, result: ArrayList<Int>) {
    visited[i][k] = true
    val move1 = arrayOf(0,0,-1,1)
    val move2 = arrayOf(-1,1,0,0)

    for(x in 0.. 3){
        if((i+move1[x] in 1..n) && (k+move2[x] in 1..n)){
            if(!visited[i+move1[x]][k+move2[x]] && arr[i+move1[x]][k+move2[x]] == 1){
                count_2667++
                dfs_2667(i+move1[x],k+move2[x], n, arr, visited, result)
            }
        }
    }
}