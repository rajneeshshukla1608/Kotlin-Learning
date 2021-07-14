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

    fun color(){
        println("german is ${color} color")
    }

}

fun main(){
    val dog1 = dog()
    dog1.breed = "german"
    dog1.color = "black"
    dog1.age = 5
    println("the breed of the dog is ${dog1.breed} and the color  is ${dog1.color} and the age of the dog is ${dog1.age}")
    dog1.eat()
    dog1.color()
    dog1.bark()
}