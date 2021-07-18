object five extends App
{
  def evenSum(n:Int):Int=n match
  {
    case 0 => 0
    case x if (x%2 == 1) => evenSum(n-1)
    case _ => n + evenSum(n-2)
  }
  println(evenSum(10))
}