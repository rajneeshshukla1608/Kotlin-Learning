fun main() {
    //immutable ist
    val list = listOf("box", "table")
    println(list.get(1))
    //mutable
    val listis = mutableListOf("list", "chair")
    println(listis)
    listis.add("tv")
    println(listis)
    //adding on index
    listis.add(2, "air")
    println(listis)
    //delete element to the list
    listis.removeAt(2)
    println(listis)
    //adding a complete array and complete list to the mutable list
    var arrayto = arrayOf("list","man")
    listis.addAll(arrayto)
    println(listis)
    
}
