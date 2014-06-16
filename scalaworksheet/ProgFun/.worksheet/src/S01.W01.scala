package S01

object W01 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(399); 
  def sqrt(x: Double) {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = if ((guess * guess) / x > .99 && (guess * guess) / x < 1.001) { true } else { false }

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  };System.out.println("""sqrt: (x: Double)Unit""");$skip(15); 

  sqrt(16.0);$skip(16); 

  sqrt(1e-20);$skip(13); 
  sqrt(1e60);$skip(13); 
  sqrt(1e20);$skip(13); 
  sqrt(1e50)}
}
