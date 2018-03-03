interface RBI
{
	public int withdraw();
	public  void balanceEnquiry();
	public  int fundsTransfer();
}

class  Axis implements RBI
{
 public int withdraw(){;;;;;;;
 return 7;
 }
 public void balanceEnquiry(){;;;;}
 public int fundsTransfer(){;;;;;
 return 8;
 }
	public static void main(String[] args) 
	{
		
  Axis a=new Axis();
  RBI rbi=new RBI();
			
			}
}
