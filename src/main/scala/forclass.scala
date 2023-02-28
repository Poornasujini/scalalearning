object forclass {
  def main(args: Array[String]): Unit = {
    val nums = Seq(1,2,3)
    for (n <- nums) println(n)

    val people = List(
      "Bill",
      "Candy",
      "Karen",
      "Leo",
      "Regina"
    )
    for (p <- people) println(p)
}
}
