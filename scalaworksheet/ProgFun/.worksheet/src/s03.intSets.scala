package s03

object intSets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(48); 
  val t1 = new NonEmpty(3, new Empty,new Empty);System.out.println("""t1  : s03.NonEmpty = """ + $show(t1 ));$skip(21); 
  val t2 = t1 incl 4;System.out.println("""t2  : s03.IntSet = """ + $show(t2 ));$skip(21); 
  val t3 = t2 incl 5;System.out.println("""t3  : s03.IntSet = """ + $show(t3 ));$skip(23); 
  val t4 = t2 union t3;System.out.println("""t4  : s03.IntSet = """ + $show(t4 ))}
}

abstract class IntSet{
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
	def union(other: IntSet): IntSet
}

class Empty extends IntSet {
	def contains(x:Int): Boolean = false
	def incl(x:Int): IntSet = new NonEmpty(x,new Empty,new Empty)
	override def toString = "."
	def union(other: IntSet): IntSet = other
}
/*object Empty extends IntSet {
	def contains(x:Int): Boolean = false
	def incl(x:Int): IntSet = new NonEmpty(x,Empty,Empty)
	override def toString = "."
}*/
class NonEmpty(elem:Int,left: IntSet,right: IntSet) extends IntSet{


		def contains(x: Int):Boolean =
			if(x < elem) left contains x
				else if (x > elem) right contains x
					else true
		def incl(x: Int): IntSet =
			if(x < elem) new NonEmpty(elem,left incl x, right)
				else if (x > elem) new NonEmpty(elem,left,right incl x)
					else this
		override def toString = "{" + left + elem + right + "}"
		def union(other: IntSet): IntSet =
			((left union right) union other) incl elem
}
