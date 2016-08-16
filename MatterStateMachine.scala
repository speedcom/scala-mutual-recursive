import scala.util.control.TailCalls._

object Matter {

  // transitions
  sealed trait Transition

  // liquid <--> vapor
  case object Vaporization extends Transition
  case object Condensation extends Transition

  // liquid <--> solid
  case object Freezing extends Transition
  case object Melting  extends Transition

  // solid <--> vapor
  case object Deposition  extends Transition
  case object Sublimation extends Transition

  def liquid(t: List[Transition]): TailRec[Boolean] = t match {
    case Nil                             => done(true)
    case Vaporization :: restTransitions => tailcall(vapor(restTransitions))
    case Freezing     :: restTransitions => tailcall(solid(restTransitions))
    case _                               => done(false)
  }

  def vapor(t: List[Transition]): TailRec[Boolean] = ???
  def solid(t: List[Transition]): TailRec[Boolean] = ???
}