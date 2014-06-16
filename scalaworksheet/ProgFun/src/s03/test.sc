package s03

import List._


object test {
  def nth[T](n: Int , xs: List[T]):T =
 		if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if(n == 0 )  		xs.head
  	else nth(n-1,xs.tail)                     //> nth: [T](n: Int, xs: s03.List[T])T
  	
  	val list = new Cons(1,new Cons(2,new Cons(3,new Nil)))
                                                  //> list  : s03.Cons[Int] = s03.Cons@79f65b0e
  	
  	nth(-2,list)                              //> java.lang.IndexOutOfBoundsException
                                                  //| 	at s03.test$$anonfun$main$1.nth$1(s03.test.scala:8)
                                                  //| 	at s03.test$$anonfun$main$1.apply$mcV$sp(s03.test.scala:14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at s03.test$.main(s03.test.scala:6)
                                                  //| 	at s03.test.main(s03.test.scala)
}