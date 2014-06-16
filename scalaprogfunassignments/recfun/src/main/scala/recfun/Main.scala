package recfun
import common._


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println("balance parantheses")
    println(balance("()".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =  if(r <0 || c > r) 0 else if(c==0 || r ==0 ) 1  else pascal(c-1,r-1)+pascal(c,r-1)
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =  isBalanced(chars,List());  def isBalanced(charsi: List[Char],stack: List[Char]=List()): Boolean = 
    											if(charsi.isEmpty){stack.isEmpty }else if(charsi.head == '(' || charsi.head == '[' || charsi.head == '{'|| charsi.head == '<')
    											  {isBalanced(charsi.tail,stack=charsi.head::stack)} else if(charsi.head == ')' || charsi.head == ']' || charsi.head == '}'|| charsi.head == '>')
    											  (!stack.isEmpty && ((charsi.head == ')' && stack.last=='(' || stack.head=='(') || (charsi.head == ']' && stack.last=='[' || stack.head=='[') || (charsi.head == '}' && stack.last=='{' || stack.head=='{') || (charsi.head == '>' && stack.last=='<' || stack.head=='<')) && isBalanced(charsi.tail,stack.tail))
    											  else isBalanced(charsi.tail,stack)

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =  if(money == 0 ) 1 else if(money < 0) 0 
  															else if (coins.length <= 0 && money >= 1) 0 
  															 else countChange(money , coins.tail) + countChange(money-coins.head, coins)
}
