package s03

import List._


object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(191); 
  def nth[T](n: Int , xs: List[T]):T =
 		if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if(n == 0 )  		xs.head
  	else nth(n-1,xs.tail);System.out.println("""nth: [T](n: Int, xs: s03.List[T])T""");$skip(62); 
  	
  	val list = new Cons(1,new Cons(2,new Cons(3,new Nil)));System.out.println("""list  : s03.Cons[Int] = """ + $show(list ));$skip(20); val res$0 = 
  	
  	nth(-2,list);System.out.println("""res0: Int = """ + $show(res$0))}
}
