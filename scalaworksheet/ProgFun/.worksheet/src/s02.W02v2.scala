package s02

object W02v2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(184); 
  def mapReduce(f:Int => Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=if(a>b) zero
 																																					 else  combine(f(a),mapReduce(f,combine,zero)(a+1,b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(115); val res$0 = 
 																																					 
 				product(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y)=>x*y,1)(a,b);System.out.println("""res0: Int = """ + $show(res$0))}
}
