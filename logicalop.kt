fun main(){
    val a = 0
    if(a > 0 || a < 0){
        println("it is  an non integer no")
    }
    else{
        println("The integer is zero")
    }

    val b = 10
    if(b >= 0 && b<= 5){
        println("the value of integer is between 0-5")
    } else{
        println("the value is not between 0-5")
    }

    val c = 10
    if(!(c >= 0 && c<= 5)){
        println("the value of integer is between 0-5")
    } else{
        println("the value is not between 0-5")
    }

    val num = 5
    when(num){
        in 1..10 -> println("between 1 -10")
        in 11..20 -> println("between 11 -20")
        else -> println("none")
    }
}