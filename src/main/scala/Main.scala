object Main {
  def myAdding(n: Int): Int = n
    .toString
    .map(f => (f.asDigit + 1).toString)
    .reduce(_+_)
    .toInt
}