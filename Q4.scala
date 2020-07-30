package Ass5

object Q4 {
  def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
    }
    
    val o=new account("2225",101,-25000)
    val p=new account("3354",102,55000)
    val q=new account("9978",103,-10000)
    val r=new account("5789",104,-5500)
    val s=new account("7021",105,5600)
    val t=new account("4905",106,-11500)
   
    
    var bank:List[account]=List(o,p,q,r,s,t)
    
    val overdraft=(list:List[account])=>list.filter(x=>x.balance<0)
    
    val balance=(list:List[account])=>list.reduce((x,y)=>new account("5007",100,x.balance+y.balance)) 
    
    val interest=(list:List[account])=>list.map(x=>(if(x.balance<0)x.balance*1.1d else x.balance*1.05d))
   
    println("List of overdraft account numbers,")
    var Oacc=overdraft(bank)
    Oacc.foreach(x=>print(x.acnumber+" "))
    
    var Total=balance(bank);
		println("\n\nTotal account balance: "+Total.balance);

		
		println("\nAccount balances after adding interest, ")
		var IAccount=interest(bank);
		IAccount.foreach(x=>print(x+"  "));
    
    
  
  }

}