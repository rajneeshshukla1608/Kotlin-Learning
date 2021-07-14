// fun main(){
//     val a = 3
//     val b = 4
//     if(a > b){
//         println("a is greator than b")
//     } else if(b > a){ 
//         println("b is greator than a")
//     } else {
//         println("both are equal")
//     }
// }

// fun main(){
//     val num = 2

//     when (num) {
//         0 -> println("zero")
//         1 -> println("one")
//         2 -> println("two")
//         3 -> println("three")
//         else -> println("none of the above")   
//     }
// }

fun main(){
    
    val num = 0
    when {
        num > 0 -> println("positive")
        num < 0 -> println("negative")
        else -> println("zero")   
    }
}