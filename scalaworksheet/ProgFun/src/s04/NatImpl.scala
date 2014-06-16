package s04
//peano numbers
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends Nat
{
	def isZero = true
	def predecessor = throw new StackOverflowError
	
	def + (that:Nat):Nat = that
	def - (that:Nat):Nat = if(that.isZero) this else throw new StackOverflowError
}
class Succ(n: Nat) extends Nat{
  def isZero = false
  def predecessor = n
  def +(that: Nat) = new Succ(n + that)
  def - (that: Nat): Nat = if(that.isZero) this else n - that.predecessor 
  
}
  


class NatImpl {

}