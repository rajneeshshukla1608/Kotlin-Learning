fun main() {
    // for loop
 for (i in 1..10) {
    println(i)
 }    
 //while loop
 var n = 1
 while(n <= 10){
     println(n)
    n++
 }
 //do-while loop
 var num = 1
 do{
     println(num)
     num++
 }while(num <= 10)
//iteration in array
 val a = arrayOf("a","v","r","t","y","u")
    for (i in 0..a.size-1) {
        println("${a[i]}")
    }
    
    for (i in 0 until a.size) {
        println("${a[i]}")
    }

  //descendinf order decrement iteartor
  for (i in 10 downTo 1) {
      println(i)
  }  
var k = 10
  while(k > 0){
      println(k)
      k--
  }

  var l = 0
  do{
      println(l)
      l--
  }while(l >= 0)

  //incrementing by 2
  for (i in 1..10 step 2) {
      println(i)
  }

 var c = 1
  while(c <= 10){
  println(c)
  c += 2
  }

  var b = 1
  do{
    println(b)
     b += 2
  }while(b <= 10)
} 


