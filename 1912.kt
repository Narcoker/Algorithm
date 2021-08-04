import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()

    val arr = Array(n){0}
    val token = StringTokenizer(br.readLine())
    var input: Int
    var max: Int = 0

    for(i in arr.indices){
        input =  token.nextToken().toInt()
        if(i == 0 || arr[i-1] + input < input ){
            arr[i] = input
            if(i == 0)
                max = arr[i]
        }

        else
            arr[i] = arr[i-1] + input

        if(max < arr[i])
            max = arr[i]
    }

    bw.write("$max")

    br.close()
    bw.close()
}