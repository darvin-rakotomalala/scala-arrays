## Scala | Arrays - ArrayBuffer

Array is a special kind of collection in scala. it is a fixed size data structure that stores elements of the same data
type. The index of the first element of an array is zero and the last element is the total number of elements minus one.
It is a collection of mutable values. It corresponds to arrays(in terms of syntax) in java but at the same time it’s
different(in terms of functionalities) from java.

**Some Important Points**:

- Scala arrays can be generic. which mean we can have an Array[T], where T is a type parameter or abstract type.
- Scala arrays are compatible with Scala sequences – we can pass an Array[T] where a Seq[T] is required.
- Scala arrays also support all sequence operations.

Scala supports both one as well as multi-dimension arrays. A single dimension array is one having only one row and n
columns whereas two dimension array is actually a matrix of dimension (n * m).

### One Dimensional Array

Syntax:

```
var arrayname = new Array[datatype](size)
```

In this array contains only one row for storing the values. All values of this array are stored contiguously starting
from 0 to the array size.

- _The **length** property returns the length of an array in Scala._
- _Array **size** is the number of elements that an array contains. It is similar to the **length** property._

### Multidimensional Arrays

The Multidimensional arrays contains more than one row to store the values. Scala has a method _Array.ofDim_ to create
Multidimensional arrays in Scala. In structures like matrices and tables multi-dimensional arrays can be used.

Syntax:

```
var array_name = Array.ofDim[ArrayType](N, M)
or  
var array_name = Array(Array(elements), Array(elements)
```

This is a Two-Dimension array. Here N is no. of rows and M is no. of Columns.

### Scala ArrayBuffer

Array in scala is homogeneous and mutable, i.e it contains elements of the same data type and its elements can change
but the size of array size can’t change. To create a mutable, indexed sequence whose size can change **ArrayBuffer** class
is used. To use, ArrayBuffer, **scala.collection.mutable.ArrayBuffer** class is imported, an instance of ArrayBuffer is
created.<br>
Internally, an ArrayBuffer is an Array of elements, as well as the store’s current size of the array. When an element is
added to an ArrayBuffer, this size is checked. If the underlying array isn’t full, then the element is directly added to
the array. If the underlying array is full, then a larger array is constructed and all the elements are copied to the
new array. The key is that the new array is constructed larger than required for the current addition.

Example:

```
var name = new ArrayBuffer[datatype]()  // empty buffer is created

var name = new ArrayBuffer("chandan", "gfg", "geeksforgeeks")
```

In above example, first, an empty buffer is created here datatype indicates the type of data such as integer, string.
Then created buffer with three elements, of type string.

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
