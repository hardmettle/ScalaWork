package test.worksheet

//import scala.collection.immutable.Map
import scala.collection.mutable.Map

object Test {

  def main(args: Array[String]): Unit = {
    val input = readInt
    for (i <- 1 to input) {
      val NK = readLine.split(" ")
      val N = NK(0)
      val K = NK(1)
      val A = readLine.split(" ")
      var S = Seq()
      A.foldLeft(Map.empty[String, Int])((z, s) => {
        z.get(s) match {
          case Some(i) =>
            val v = i + 1; if (v == K.toInt && !S.contains(s)) {
              S :+ s
              z - s
            } else {
              z += s -> v
            }
          case None => z+= s -> 1
        }
        z
      })
      if (S.length != 0)
        S.foreach(e => print(s"$e "))
      else
        print(-1)

      println()
    }
  }

}