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

  println("--------------------------------------------------")
