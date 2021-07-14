// Using simple class
class Student(val name: String, val rollNumber: Int, val percentageMarks: Double) {

   fun printValues(){
       println("Name: $name, Roll Number: $rollNumber, Percentage: $percentageMarks")
   }
}

fun main() {
   val studentList = mutableListOf<Student>()
   studentList.add(Student("Cristina", 1290, 78.5))
   studentList.add(Student("Mark", 1291, 88.25))
   studentList.add(Student("Lea", 1292, 71.0))
   studentList.add(Student("Jack", 1293, 78.5))
   studentList.add(Student("Anies", 1294, 78.5))
   studentList.add(Student("Danielle", 1295, 78.5))
   studentList.add(Student("Sandra", 1296, 78.5))
   studentList.add(Student("Katina", 1297, 78.5))
   studentList.add(Student("Edgar", 1298, 78.5))
   studentList.add(Student("Felix", 1299, 78.5))

   for (i in studentList){
       i.printValues()
   }
}

// Data class implementation 
// 
// Uncomment the below code and comment the above to run this
/*
data class Student(val name: String, val rollNumber: Int, val percentageMarks: Double)

fun main() {
   val studentList = mutableListOf<Student>()
   
   studentList.add(Student("Jack", 1293, 78.5))
   studentList.add(Student("Anies", 1294, 78.5))
   studentList.add(Student("Danielle", 1295, 78.5))
   studentList.add(Student("Sandra", 1296, 78.5))
   studentList.add(Student("Katina", 1297, 78.5))
   studentList.add(Student("Edgar", 1298, 78.5))
   studentList.add(Student("Felix", 1299, 78.5))

   for (i in studentList){
       println(i)
   }
}
*/