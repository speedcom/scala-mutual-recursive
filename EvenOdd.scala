import scala.util.control.TailCalls._

object EvenOddNumber {

  def isOdd(n: Int): TailRec[Boolean]  = if(n == 0) done(false) else tailcall(isEven(n-1))

  def isEven(n: Int): TailRec[Boolean] = if(n == 0) done(true) else tailcall(isOdd(n-1))
}