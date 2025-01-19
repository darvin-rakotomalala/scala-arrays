/*
  Examples to show how to use the above methods to append and prepend elements to an Array
 */
class AppendPrependElement {

  def appendPrependDemo(): Unit = {
    // Declaring an array
    val a = Array(45, 52, 61)
    println("- Array a: ")
    for (x <- a) println(x)

    // Appending 1 item
    val b = a :+ 27
    println("- Appending 1 item - Array b: ")
    for (x <- b) println(x)

    // Appending 2 item
    val c = b ++ Array(1, 2)
    println("- Appending 2 item - Array c: ")
    for (x <- c) println(x)

    // Prepending 1 item
    val d = 3 +: c
    println("- Prepending 1 item - Array d: ")
    for (x <- d) println(x)

    // Prepending 2 item
    println("- Prepending 2 item - Array e: ")
    val e = Array(10, 25) ++: d
    for (x <- e) println(x)

  }

}
