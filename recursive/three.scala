object three extends App{

  def sum(n:Int):Int= n match{
    case x if (x == 1) => 1
    case _ => n + sum(n - 1)
  }

  println(sum(5))
}