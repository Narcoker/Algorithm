import java.math.BigInteger

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = Array(10001){BigInteger("0")}

    for(i in 1 until arr.size){
        if(i == 1)  arr[i] = BigInteger("1")
        else arr[i] = arr[i-2] + arr[i-1]
    }

    val input = br.readLine().toInt()
    bw.write("${arr[input]}")

    br.close()
    bw.close()
}