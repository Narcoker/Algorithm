fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()

    if(n%2 ==1){
        bw.write("CY")
    }else{
        bw.write("SK")
    }

    br.close()
    bw.close()
}