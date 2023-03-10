object matchclass {
  def main(args: Array[String]): Unit = {
    def fibSeq(n: Int): List[Int] = {
      var ret = scala.collection.mutable.ListBuffer[Int](1, 2)
      while (ret(ret.length - 1) < n) {
        val temp = ret(ret.length - 1) + ret(ret.length - 2)
        if (temp >= n) {
          return ret.toList
        }
        ret += temp
      }
      ret.toList
    }


  }

}