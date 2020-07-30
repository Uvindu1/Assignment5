package Ass5

object Q3 {
   def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
      
 
     def transfer(p:account,q:Double)=
       {
        this.balance=this.balance-q
        p.balance=p.balance+q
       }
    }
    val a=new account("2234",101,35000)
    val b=new account("3312",102,23000)
    val c=new account("6542",103,11000)
     
    val p=a.transfer(b,6500)
    
    println("New balance of b :"+b.balance)
    println("New balance of a:"+a.balance)
  }
}