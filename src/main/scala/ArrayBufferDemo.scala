import scala.collection.mutable.ArrayBuffer

/*
    Scala program to illustrate the ArrayBuffer
 */
class ArrayBufferDemo {

  def creatingInstance(): Unit = {
    // Instance of ArrayBuffer is created
    var name = ArrayBuffer[String]()
    name += "Darvin"
    name += "Tojo"
    name += "Chandan"

    println("- Instance of ArrayBuffer: ")
    println(name)

    println("- Access element from ArrayBuffer: ")
    println(name(1))
  }

  def addingElement(): Unit = {
    /*
      Add single element to the buffer: ArrayBuffer += ( element)
      Add two or more elements (method has a varargs parameter) : ArrayBuffer += (element1, element2, ..., elementN)
      Append one or more elements (uses a varargs parameter): ArrayBuffer.append( elem1, elem2, ... elemN)
     */
    // Instance of ArrayBuffer is created
    var name = ArrayBuffer[String]()

    // adding one element
    name += "Darvin"

    // add two or more elements
    name += ("Tojo", "chandan")

    // adding one or more element using append method
    name.append("S-series", "Ritesh") // Symbol append is deprecated. Use appendAll instead

    println("- Add element in ArrayBuffer: ")
    println(name)
  }

  def deletingElement(): Unit = {
    /*
      Remove one element : ArrayBuffer -= (element)
      Remove multiple elements: ArrayBuffer -= (elem1, elem2, ....., elemN)
     */

    var name = ArrayBuffer("DarvinTojo", "gfg", "chandan", "S-series", "Ritesh")

    // deletes one element
    name -= "DarvinTojo"

    // deletes two or more elements
    name -= ("gfg", "chandan")

    println("- Deleting ArrayBuffer Elements result: ")
    println(name)
  }

  /*
    Deleting ArrayBuffer Elements using ArrayBuffer.remove()
    The remove method is used to delete one element by its position in the ArrayBuffer,
    or a series of elements beginning at a starting position.
   */
  def removeArrayBufferDemo(): Unit = {
    var name = ArrayBuffer("DarvinTojo", "Rakoto", "chandan", "S-series", "Ritesh")

    // removing 0th index element
    name.remove(0)
    println("- Removing 0th index element result: ")
    println(name)

    name.remove(1, 3)
    println("- Deleting ArrayBuffer Elements using ArrayBuffer.remove(): ")
    println(name)
  }

}
