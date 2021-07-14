class Student(val name: String, val rollnumber: Int, val percentagemarks: Int){
    
    fun printvalues(){
        println("the name of the student is ${name} and the rollnumber is ${rollnumber} and he get marks of ${percentagemarks}")
    }
} 

fun main() {
  val studentlist = mutableListOf<Student>()
  studentlist.add(Student("raj",1,20))
  studentlist.add(Student("suraj",2,205))
  studentlist.add(Student("sarvesh",3,20))
  studentlist.add(Student("nanha",4,20))
  studentlist.add(Student("gajodhar",5,20))
  studentlist.add(Student("sheetal",6,20))
  studentlist.add(Student("navin",7,20))
  studentlist.add(Student("abhinav",8,20))
  studentlist.add(Student("saumya",9,20))
  studentlist.add(Student("shradha",10,20))
  
  for(i in studentlist){
     i.printvalues()
  }
}
