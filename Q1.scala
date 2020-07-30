package Ass5

class Rational(x:Int,y:Int)
{
   def numer=x
   def denom=y
      
 def neg = new Rational(-this.numer,this.denom)
     
}

object Q1 {
  def main(args:Array[String])
  {

    val a=new Rational(5,12)
    
    
    println("Rational number that we want to get negative value:"+(a.numer,a.denom))
 
    println("Negative value of rational number:"+(a.neg.numer,a.neg.denom))
 
   }
}