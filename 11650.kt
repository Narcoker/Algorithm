
//클래스, 우선순위 큐, Scanner : 191948KB 2568ms
//import java.util.*
//class Node(var x:Int, var y:Int) : Comparable<Node> {
//    override fun compareTo(other: Node): Int {
//        if (this.x == other.x) {
//            return this.y - other.y
//        } else
//            return this.x - other.x
//    }
//}
//
//fun main() = with(Scanner(System.`in`)){
//    val q = PriorityQueue<Node>()
//
//    val n = nextInt()
//    for(i in 1 .. n){
//        val temp = Node(nextInt(),nextInt())
//        q.add(temp)
//    }
//
//    while(!q.isEmpty()) {
//        val temp : Node = q.poll()
//        print("${temp.x} ${temp.y}")
//        println()
//    }
//}

// Pair, List, Scanner : 196520KB 2504ms
//import java.util.*
//fun main() = with(Scanner(System.`in`)) {
//    val pairs = mutableListOf<Pair<Int,Int>>()
//    val n = nextInt()
//
//    for(i in 1 .. n)
//        pairs.add(Pair(nextInt(), nextInt()))
//
//    pairs.sortWith(compareBy < Pair<Int,Int> >{it.first}.thenBy { it.second })
//    pairs.forEach{
//        print("${it.first} ${it.second}")
//        println()
//    }
//}
import java.util.* //Pair, BufferReader, BufferWriter : 81868KB 2044ms

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var n = br.readLine().toInt()

    val pairs = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n){
        val token = StringTokenizer(br.readLine())
        pairs.add(Pair(token.nextToken().toInt(), token.nextToken().toInt()))
    }
    br.close()

    pairs.sortWith(compareBy<Pair<Int, Int>>{it.first}.thenBy{it.second})
    pairs.forEach { bw.write("${it.first} ${it.second}\n") }
    bw.close()
}