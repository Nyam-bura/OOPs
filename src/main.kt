import javax.swing.AbstractListModel

fun main(){
  var Abigael=Humans("Allan",12,40)
  Abigael.eat(78)
  println(Abigael.weight)
  Abigael.speak("I am Abigael Muthoni")
  Abigael.birthday(20)
  println(Abigael.age)
  var Stanley=User("crispus","wainaina","wainainacrispus@gmail.com",325166,"Christ")
  println(Stanley.firstname)
   println(Stanley.email)


}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-speak(speech: String) :Prints the string passed toit
//birthday( ) :Increments the human’s age by 1
//Create an instance of this human class and invoke all its functions
class Humans(var name:String, var age:Int, var weight:Int) {
  fun eat(foodweight: Int) {
    println("I am eating $foodweight kgs of food")
    weight+=foodweight

  }
  fun speak(speech:String){
    println(speech)

  }
  fun birthday(yearmonth:Int) {
    age++

  }
}









//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any attribute.
data class User(var firstname:String,var lastname:String,var email:String,var phonenumber:Int,var password:String)

