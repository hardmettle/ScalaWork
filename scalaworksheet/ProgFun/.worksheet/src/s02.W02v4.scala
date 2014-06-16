package s02

object W02v4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  
  	val x = new Rational(1,2);System.out.println("""x  : s02.Rational = """ + $show(x ));$skip(11); val res$0 = 
  	x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  	x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

		val y  = new Rational(2,3);System.out.println("""y  : s02.Rational = """ + $show(y ));$skip(11); val res$2 = 
		x.add(y);System.out.println("""res2: s02.Rational = """ + $show(res$2));$skip(13); val res$3 = 
		
		x.neg();System.out.println("""res3: s02.Rational = """ + $show(res$3));$skip(10); val res$4 = 
		y.neg();System.out.println("""res4: s02.Rational = """ + $show(res$4));$skip(14); val res$5 = 
		
		x.sub(y);System.out.println("""res5: s02.Rational = """ + $show(res$5));$skip(32); 
		
		val x1 = new Rational(1,3);System.out.println("""x1  : s02.Rational = """ + $show(x1 ));$skip(29); 
		val y2 = new Rational(5,7);System.out.println("""y2  : s02.Rational = """ + $show(y2 ));$skip(29); 
		val z2 = new Rational(3,2);System.out.println("""z2  : s02.Rational = """ + $show(z2 ));$skip(24); val res$6 = 
		
		x1.sub(y2).sub(z2);System.out.println("""res6: s02.Rational = """ + $show(res$6));$skip(13); val res$7 = 
		y2.add(y2);System.out.println("""res7: s02.Rational = """ + $show(res$7));$skip(16); val res$8 = 
		
		x1.max(y2);System.out.println("""res8: s02.Rational = """ + $show(res$8));$skip(18); val res$9 = 
		new Rational(2);System.out.println("""res9: s02.Rational = """ + $show(res$9))}
}

class Rational(x:Int,y:Int){
		
		require(y!=0,"requirement failed")
		def this(x:Int) = this(x,1)
		private def gcd(a: Int,b: Int): Int = if(b == 0) a else gcd(b,a % b)
		private val g = gcd(x,y)
		def numer = x
		def denom = y
		
		def less(that: Rational) = numer * that.denom < that.numer * denom
		
		def max(that:Rational) = if(this.less(that)) that else this
		 
		def add(that: Rational) =
			new Rational(
			numer * that.denom + that.numer * denom ,
			denom * that.denom)
			
		def neg () = new Rational(-1* numer , denom)
		
		def sub(that: Rational) = add(that.neg)

			override def toString = numer/g + "/" + denom/g
}
