
fun main(args: Array<String>) { // main function in Kotlin
  // println() function
  println("Merry Christmas")
  println(args.contentToString() + " Hello, world!")
  print("Penge Paracetamol\n\n")

  // val keyword (read-only)
  val a: Int = 324 // immediate assignment
  println(a)
  val b = "Hello" // inferred
  println(b)
  println(b::class.simpleName)

  val c: Int
  c = 2
  println(c)

  // var keyword (can be re-assigned)
  println("-----------------------")
  var helicopter = 123
  println(helicopter)

  helicopter++
  println(helicopter)

  helicopter = helicopter * 2 / 3
  println(helicopter)

  // Comments:
  // This is an end-of-line comment
  /* This is a block comment
  on multiple lines. */
  
  /* The comment starts here
  /* contains a nested comment */
  and ends here. */

  // Int data type
  var myvar = 12
  println("Inferred as " + myvar::class.simpleName)
  // Long data type (explicitly declared or if number can't be handled by Int)
  var myvar2 = 12L
  println(myvar2::class.simpleName)
  // Byte data type (explicitly declared)
  var myvar3: Byte = 1
  println(myvar3::class.simpleName)

  // Double data type
  var myvar4 = 12.12
  println("Inferred as " + myvar4::class.simpleName)
  // Float data type (need to place 'F' or 'f' at the end)
  var myvar5 = 12.12F
  println("Inferred as " + myvar5::class.simpleName)

  // functions (datatype of the argument(s) passed MUST be 
  // exactly the same as the function parameter(s))
  fun printDouble(d: Double) { 
    println(d) 
  }
  var x = 12.12
  printDouble(x)

  // proper conversion (explicitly)
  var myByte: Byte = 12
  var myInt: Int = myByte.toInt()
  println(myInt)

  // compare character
  var myChar: Char = '1'
  if (myChar == '1') {
    println("Character is " + myChar)
  }

  // convert character to Int
  fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
      throw IllegalArgumentException("Out of range")
    }
    return c.toInt() - '0'.toInt()
  }
  var x1: Int = decimalDigitValue('9')
  var x2: Int = decimalDigitValue('8')
  println("x1 - x2 = " + (x1 - x2))

  // boolean
  var myBool: Boolean = true
  println(myBool)

  // arrays using Array constructor
  println("-------- arrays")
  // automatic iteration
  // left-hand side = index
  // right-hand side = value that will be stored in the i-th index
  var myArray = Array(5) {
    i -> i + 1
    /* using it keyword (no need to assign)
      it + 1
    */
  }
  // it = keyword (automatic variable when using a function)
  myArray.forEach {
    println(it)
  }

  // accessing using index
  println("idx = 0" + myArray[0])
  
  // strings
  var myString: String = "Happy New Year"
  /* myString.forEach {
    println(it)
  } */
  // cannot do this: myString[0] = 'W', because strings are immutable
  println(myString[0])

  // raw strings
  var myRawString: String = """asdf\nasdf\n"""
  println(myRawString)

  // string templates
  var name = "Jason"
  println("The length of '$name' is ${name.length}")

  
}