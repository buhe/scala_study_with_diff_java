object Main extends App {
  println("Hello, World!")
  val y = XiaoM
  println(y.a)
  val z = new XiaoH(31)
  z.p()
}

class XiaoM(val c: Int) {
  val x = 666

  def d(s: String) = println(s)
}

object XiaoM {
  val z = new XiaoM(22)
  val a = z.x
  z d "1"
}

class XiaoH(b: Int) extends XiaoM(b) {
  def p() = println(c)
}