class Clothes(var material: String,var color: String, var price: Int) {    
fun material(){
    println("${material} is type of clothes whose color is ${color} and price is ${price}")
}
}
fun main(){
    var clothes1 = Clothes(material = "reon" , color = "blue" , price = 754)
    clothes1.material()
}