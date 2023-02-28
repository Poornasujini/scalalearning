object fib {
  def main(args: Array[String]): Unit = {

    def fibonacci(n: Int): Int = {
      if (n <= 1) n
      else fibonacci(n - 1) + fibonacci(n - 2)
    }
    println(fibonacci(10))

  }
}
