package S01

object W01 {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  def sqrt(x: Double) {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = if ((guess * guess) / x > .99 && (guess * guess) / x < 1.001) { true } else { false }

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }                                               //> sqrt: (x: Double)Unit

  sqrt(16.0)

  sqrt(1e-20)
  sqrt(1e60)
  sqrt(1e20)
  sqrt(1e50)
}