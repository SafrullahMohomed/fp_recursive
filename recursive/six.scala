object six extends App
{
  def fib(n:Int):Int= n match
  {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  }

  def fibseq(n:Int): Unit = 
  {
      if(n > 0) fibseq(n-1)
      println(fib(n))
  }
  fibseq(15)
}