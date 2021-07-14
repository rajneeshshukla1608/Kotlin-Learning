// Create a parent class Car and functions speedUp() and applyBrake(). Now create two different child classes inheriting class Car. Also, create objects for both of the child classes and 
// use the functions that were created inside the parent class.
open class car{
    fun speedup(){
        println("speedup")
    }
    
    fun applybrakes(){
        println("brakes applied")
    }
}
class hyundai(): car(){
    
}
class tata(): car(){
    
}

fun main() {
    
    val car1 = hyundai()
    car1.speedup()
    car1.applybrakes()
    
    val car2 = tata()
    car2.speedup()
    car2.applybrakes()
}