@main
def main(): Unit =
  println("---------------------------------------------------")
  println("Hello world! This is an example of the Scala Arrays")

  val oneDimEx = new OneDimensionalDemo()
  oneDimEx.weekDaysExample()
  oneDimEx.printLengthOfArray()
  oneDimEx.printSizeOfArray()
  oneDimEx.basicOperation()
  oneDimEx.updatingElement()
  oneDimEx.addingElement()
  oneDimEx.concatenateArrays()
  oneDimEx.concatenatingArrays()

  println("--------------------------------------------------")
  oneDimEx.accessingModifyingElement()
  oneDimEx.iteratingDemo()

  println("--------------------------------------------------")
  val multiDimEx = new MultidimensionalDemo()
  multiDimEx.multidimensionalDemo()

  println("--------------------------------------------------")
  val appendPrependEx = new AppendPrependElement()
  appendPrependEx.appendPrependDemo()

  println("--------------------------------------------------")
  val arrayBufferEx = new ArrayBufferDemo()
  arrayBufferEx.creatingInstance()
  arrayBufferEx.addingElement()
  arrayBufferEx.deletingElement()
  arrayBufferEx.removeArrayBufferDemo()
