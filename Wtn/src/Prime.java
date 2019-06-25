
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(i=1;i<=100;i++)
{   
	int c=0;
	for(j=1;j<=100;j++)
	{
		if(i%j==0)
		{
			c++;
		}
	
	}
  if(c==2)
  {
	  System.out.print(i+" ");
  }
	
}
	}

}
