import Array._

/*
  Scala program to illustrate an one dimensional array
 */
class OneDimensionalDemo {

  // create some arrays
  val randomNumbers = Array(34, 2, 5, 70, 1)
  val fruits = Array("Pineapple", "Banana", "Orange")
  val cgpas: Array[Double] = Array(3.4, 4.5, 2.5, 0.5)
  val names = new Array[String](3)

  def weekDaysExample(): Unit = {
    // allocating memory of 1D Array of string.
    var days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    println("- Array elements are : ")
    for (m1 <- days) println(m1)

    println("- The Length of days: " + days.length)
    println("- The size of days: " + days.size)
  }

  def printLengthOfArray(): Unit = {

    names(0) = "Amara"
    names(1) = "Funke"
    names(2) = "Ade"

    // print length of arrays
    println("- The Length of randomNumbers: " + randomNumbers.length)
    println("- The Length of fruits: " + fruits.length)
    println("- The Length of cgpas: " + cgpas.length)
    println("- The Length of names: " + names.length)
  }

  def printSizeOfArray(): Unit = {
    // get and print there sizes
    println("- The size of names: " + randomNumbers.size)
    println("- The size of fruits: " + fruits.size)
    println("- The size of cgpas: " + cgpas.size)
  }

  def basicOperation(): Unit = {
    // allocating memory of 1D Array of string.
    var name = Array("gfg", "geeks", "GeeksQuize", "geeksforgeeks")
    // Accessing an array element
    println("- Second element of an array is: " + name(1))
  }

  def updatingElement(): Unit = {
    // allocating memory of 1D Array of string.
    var name = Array("gfg", "geeks", "GeeksQuize", "geeksforgeeks")

    // Updating an element in an array
    name(1) = "employee"
    println("- After updating array elements are: ")

    for (m1 <- name) println(m1)
  }

  def addingElement(): Unit = {
    var name = new Array[String](4)

    // Adding element in an array
    name(0) = "gfg"
    name(1) = "geeks"
    name(2) = "GeeksQuize"
    name(3) = "geeksforgeeks"
    println("- After adding array elements : ")

    for (m1 <- name) println(m1)
  }

  def concatenateArrays(): Unit = {
    var arr1 = Array(1, 2, 3, 4)
    var arr2 = Array(5, 6, 7, 8)

    var arr3 = concat(arr1, arr2)

    println("- After concatenating array elements : ")
    // Print all the array elements
    for (x <- arr3) println(x)
  }

}
