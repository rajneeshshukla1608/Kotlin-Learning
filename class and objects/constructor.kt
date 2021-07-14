class Dog(var breed:String, var color: String,var age: Int) {
    fun eat(){
        println("the dog is breed of ${breed}")
    }
    fun bark(){
        println("the dog color is ${color}")
    }
}
fun main() {
    var dog1 = Dog(breed = "german",color = "blue", age = 45)
    dog1.bark()
    dog1.eat()

}