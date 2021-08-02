import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    
    var token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toLong()

    val arr = Array<Long>(n){0}

    for(i in arr.indices){
        arr[i] = br.readLine().toLong()
    }

    var left: Long = 1
    var right = arr[0]
    var mid: Long

    for(i in 1 until n){
        if(arr[i] > right)
            right = arr[i]
    }

    var sum: Long

    while(right >= left){
        sum = 0
        mid = (left + right) / 2

        for(i in arr.indices){
            sum += arr[i] / mid
        }

        if(sum >= m){
            left = mid + 1
        }else if(sum < m){
            right = mid - 1
        }
    }
    bw.write("$right")

    br.close()
    bw.close()
}