// the resolve the errors and exceptions we use try catch block 
fun main(){
    // var arr = arrayOf('2','4')
    // try {
    //     arr[4] = '5'
    // }
    // catch(e: ArrayIndexOutOfBoundsException ) {
    //  println("error occured")
    // } finally {
    //     println(arr[2])
    // }

    var arr = arrayOf('2','4')
    try {
        arr[4] = '5'
    }
    catch(e: Exception ) {
     println("error occured")
    } 
    println(arr[2])
    

}
