// Create an interface Games with the functions named as football, cricket and basketball, without any 
// default implementations. Now create a class named Sports which implements this interface and override all the 
// functions while printing a corresponding message for each sport.

interface games{
    fun football()
    fun cricket()
    fun basketball()
}
class Sports: games{
    override fun football(){
        println("i play football")
    }
    
    override fun cricket(){
        println("i play cricket")
    }
    
    override fun basketball(){
        println("i play basketball")
    }
}
fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()
    
}