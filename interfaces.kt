interface myinterface {
    fun hello()  // functions without any impletition

    fun greeting() = println("hello there")  // function with default implementations
}
interface newiterfaces{
    fun newmethod()
}
class callme : myinterface, newiterfaces{

    override fun hello(){
        println("function hello is defined")
    }
    //we can also override the greeting function

    override fun greeting(){
        println("this function is overrided")
    }
    
    override fun newmethod(){
        println("function of new method")
    }
}

fun main(){
    val a = callme()
    a.hello()
    a.greeting()
    a.newmethod()
} 