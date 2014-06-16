package testf

class FindFibbo {
	def main(args:Array[String]){
	 for (ln <- io.Source.stdin.getLines){
	   val N:Int = ln.trim.toInt
	   val num1 = (5*(math.pow(N, 2).toInt))+4
	   val num2 = (5*(math.pow(N, 2).toInt))-4
	   val res1 = math.sqrt(num1).toInt
	   val res2	= math.sqrt(num2).toInt
	   if(res1*res1 == num1 && res2*res2 == num2){
	     println("IsFibo")
	   }
	   else{
	     println("isNotFibo")
	   }
	 }
	}
}