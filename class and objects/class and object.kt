class dog {
    var breed: String = "labrador"
    var color: String = "brown"
    var age: Int = 4
//member function
    fun eat() {
     println("${breed}s eat food")    
    }

    fun bark(){
     println("${breed}s bark")
    }

}

fun main(){
    val dog1 = dog()
    dog1.eat()
    dog1.bark()
}