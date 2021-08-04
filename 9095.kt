fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = Array(11){0}

    for(i in 1 .. 10){
        if(i == 1) arr[i] = 1
        else if(i == 2) arr[i] = 2
        else if(i== 3) arr[i] = 4
        else arr[i] = arr[i-3] + arr[i-2]+ arr[i-1]
    }

    val n = br.readLine().toInt()
    var input :Int
    repeat(n){
        input = br.readLine().toInt()
        bw.write("${arr[input]}\n")
    }

    br.close()
    bw.close()
}