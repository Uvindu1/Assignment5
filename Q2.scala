package Ass5

object Q2 {
    def main(args:Array[String])
    {
     class Rational(x:Int,y:Int)
    {
      def numer=x
      def denom=y
      
      def sub(r:Rational)= new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
      
    }
    val a=new Rational(3,4)
    val b=new Rational(5,8)
    val c=new Rational(2,7)
    
  //  println((a.sub(b).numer,a.sub(b).denom))
   
    //println("")
    val u=new Rational(a.sub(b).numer,a.sub(b).denom)
    
    println("(x-y-z)="+(u.sub(c).numer,u.sub(c).denom))
}
}