// In the previous class Car give the properties as brandName and color. Initialise the brandName as Hyundai and Honda 
// for the respective classes.

open class Car(var brandname: String, var color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
}

class Hyundai(brandname: String = "Hyundai", color: String = "black") : Car(brandname,color) {

}

class Honda(brandname: String = "Hyundai", color: String = "black") : Car(brandname,color) {

}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
}