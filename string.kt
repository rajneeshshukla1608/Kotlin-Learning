fun main(){
    val s = "hello"
    val stringlength = s.length
    val stringindex = s.get(4)
    println(stringlength)
    println("the string index is : $stringindex")
    println("the string index is ${s.get(4)}")
    println(s.subSequence(0, 4))
    println(s.hashCode())
    println(s.lines())
}