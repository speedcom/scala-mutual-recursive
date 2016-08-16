# Scala Mutual Recursive

Playground and notes for learning mutual recursive in Scala.

Notes:

1. Support for trampoling in Scala lives in `scala.util.control.TailCalls`. It comes in two parts:
 
 1. `done()` function - is used to return the final  result from recursive calls.
 2. `tailcall()` function - responsible for making the recursive calls.

Result returned by the tail recursive functions are wrapped in a `TailRec` type (rather that being returned directly).
In order to get them out at the end we need to run `result()` method on `TailRec` instance.
