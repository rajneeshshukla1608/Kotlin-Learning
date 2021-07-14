import java.util.*
fun main(){
    // val ary = arrayOf<String> ("hello")
    val ary = arrayOf("hello")
    
    //or we can write it as 
    var stringarray:Array<String> = arrayOf("hello","world!","we")
    
    println(stringarray[1])

    //or
    println(stringarray.get(1))

    stringarray[1] = "infinity"

    println(Arrays.toString(stringarray))

    println(stringarray.size)

    println(Arrays.toString(ary))

    println(Arrays.toString(stringarray))
}