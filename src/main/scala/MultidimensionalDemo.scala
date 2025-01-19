/*
  Scala program to illustrate a multidimensional array.
*/
class MultidimensionalDemo {

  def multidimensionalDemo(): Unit = {
    val rows = 2
    val cols = 3

    // Declaring Multidimensional array
    val names = Array.ofDim[String](rows, cols)

    // Allocating values
    names(0)(0) = "gfg"
    names(0)(1) = "Geeks"
    names(0)(2) = "GeeksQuize"
    names(1)(0) = "GeeksForGeeks"
    names(1)(1) = "Employee"
    names(1)(2) = "Author"
    for {
      i <- 0 until rows
      j <- 0 until cols
    }
      println(s"($i)($j) = ${names(i)(j)}")
  }
}
