package s02

object W02v2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def mapReduce(f:Int => Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=if(a>b) zero 
 																																					 else  combine(f(a),mapReduce(f,combine,zero)(a+1,b))
 																																					 
 				product(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y)=>x*y,1)(a,b) 
}