package s04


trait List[T] {
  
		def isEmpty: Boolean
		def head: T
		def tail: List[T]
}

class Cons[T](val head: T,val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T]{
  
	def isEmpty = true;
	def head: Nothing= throw new NoSuchElementException("Nil.Head")
	def tail: Nothing = throw new NoSuchElementException("Nil.Head")
  }
  
object List {
  //List(1,2) = List.apply(1 , 2)
  def apply[T](x1: T,x2: T): List[T] = new Cons(x1,new Cons(x2, new Nil))
  def apply[T]() = new Nil
  }