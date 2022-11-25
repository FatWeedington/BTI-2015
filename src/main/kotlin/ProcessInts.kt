fun process1Int(n: Int, action: (Int) -> Int) =  action(n)

fun process2Int(n1: Int, n2:  Int, action: (Int,Int) -> Int) = action(n1,n2)

fun process3Int(n1: Int,n2:  Int, n3 : Int, action: (Int,Int) -> Int) =  action(n1,action(n2,n3))

fun main() {
    println(process1Int(5) { i -> i.inc() })
    println(process2Int(3,5) { i, j -> i * j })
    println(process3Int(3,5,6) { i,j -> i*j })
}