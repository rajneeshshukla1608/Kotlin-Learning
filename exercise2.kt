fun main() {
    val arr = listOf('+', '-', '*', '/')
    for(i in arr){
      val output = iterate(20, 30, i)
      println("The operation $i is $output")
    }
}
fun iterate(a: Int,b: Int,operator: Char): Int {
    var c = 0
    if(operator == '+'){
     c = a + b   
    } else if(operator == '-') {
        c = a - b
    } else if(operator == '*'){
        c = a * b
    } else if(operator == '/'){
     if (b != 0) {
           c = a / b
       } else {
           c = 0
       }
    }
      return c
 }   
