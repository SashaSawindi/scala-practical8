object p82 {

  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    val isMultipleOfThree: Int => Boolean = _ % 3 == 0
    val isMultipleOfFive: Int => Boolean = _ % 5 == 0

    val categorizeNumber: Int => String = {
      case n if isMultipleOfThree(n) && isMultipleOfFive(n) => "Multiple of Both Three and Five"
      case n if isMultipleOfThree(n) => "Multiple of Three"
      case n if isMultipleOfFive(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(categorizeNumber(input))
  }
}
