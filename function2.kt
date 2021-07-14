fun main(){
    fun add(x: Int, y: Int): Int {
        return x + y
    }
    fun add2(x: Int, y: Int) = x + y
    println(add(2, 2))
    println(add2(2, 2))
    print(hello())
    println(multiple(23))
    println(multiple2(23))
}
fun hello(): Unit{
    println("hello")
}

fun multiple(x: Int): Int{
    return x * 2
}
fun multiple2(x: Int) = x * 2

