object Main extends App {
  println("Hello, World!")
  val y = XiaoM
  println(y.a)
}

class XiaoM {
  val x = 666
}

object XiaoM {
  val z = new XiaoM
  val a = z.x
}