class Person(val name: String , val age:Int) extends Ordered[Person]
{
  def compare(that: Person): Int =
  {
    if (this.name == that.name)
      {
        println("Person One Name is equal to Person Two Name")
        println("Checking the Age...")
        this.age - that.age
      }
    else
      {
        this.name.length compare that.name.length
      }
  }
}
object PersonObject extends App
{
  var PersonOne = new Person("John", 23)
  var PersonTwo = new Person("John", 25)
  println(PersonOne < PersonTwo)
  println(PersonOne > PersonTwo)
}
