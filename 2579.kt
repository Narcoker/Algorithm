fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()
    var stair = Array(n+1){Array(2) {0} }
    var input:Int
    for(i in 1 until stair.size){
        input = br.readLine().toInt()
        if(i==1){
            stair[i][0] = input
            stair[i][1] = input
        }else{
            stair[i][0] = stair[i-1][1] + input
            stair[i][1] = kotlin.math.max(stair[i-2][0],stair[i-2][1]) + input
        }
    }

    bw.write("${kotlin.math.max(stair[n][0], stair[n][1])}")

    br.close()
    bw.close()
}