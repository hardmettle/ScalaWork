package s02

object W02v4 {
  
  	val x = new Rational(1,2)                 //> x  : s02.Rational = 1/2
  	x.numer                                   //> res0: Int = 1
  	x.denom                                   //> res1: Int = 2

		val y  = new Rational(2,3)        //> y  : s02.Rational = 2/3
		x.add(y)                          //> res2: s02.Rational = 7/6
		
		x.neg()                           //> res3: s02.Rational = 1/-2
		y.neg()                           //> res4: s02.Rational = -2/3
		
		x.sub(y)                          //> res5: s02.Rational = 1/-6
		
		val x1 = new Rational(1,3)        //> x1  : s02.Rational = 1/3
		val y2 = new Rational(5,7)        //> y2  : s02.Rational = 5/7
		val z2 = new Rational(3,2)        //> z2  : s02.Rational = 3/2
		
		x1.sub(y2).sub(z2)                //> res6: s02.Rational = -79/42
		y2.add(y2)                        //> res7: s02.Rational = 10/7
		
		x1.max(y2)                        //> res8: s02.Rational = 5/7
		new Rational(2)                   //> res9: s02.Rational = 2/1
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