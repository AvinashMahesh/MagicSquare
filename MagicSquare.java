public class MagicSquare {

	private int [][] theSq ;
	public MagicSquare (int [][] sqData)
	{
	theSq = sqData;
	}
	
	public boolean isMagic() {
		
		for (int a = 0; a < theSq.length - 1; a++)
		{
		if (rowSum (a) != rowSum (a+1) )
		{
			return false;
		}
		
		
		if (colSum (a) != colSum (a+1) )
				{
			
			return false;
				}
		if (diag1() != diag2() )
			{
			
			return false;
			}
		
		if (valuesCheck() != true)
		{
			return false;
		}
		
		} 
		return true;	
		}
	
		
	
	public boolean isA4x4Durer() {
		boolean durer = true; 
		int a = rowSum(0);
		if (isMagic() == true && theSq.length == 4 && theSq[0].length == 4)
		{
		if (ULSum() != a)
			durer = false;
		if (LLSum() != a)
			durer = false;
		if (URSum() != a)
			durer = false;
		if (LRSum() != a)
			durer = false;
		if (cornerSum() != a)
			durer = false;
		if (centerSum() != a)
			durer = false; 
		if (topBottomCenterCells() != a)
			durer = false; 
		if (leftRightCenterCells() != a)
			durer = false; 
		}
		else 
			return false; 
		
		return durer;
	}
	
	private int cornerSum() {
		int sum = 0;
		sum = theSq[0][0] + theSq[3][0] + theSq[0][3] + theSq[3][3];
		return sum;
	}
	
	private int centerSum() {
		int sum = 0;
		sum = theSq[1][1] + theSq[1][2] + theSq[2][1] + theSq[2][2];
		return sum; 
	}
	
	private int colSum (int c) {
		int coltotal = 0; 
		
		for (int row = 0; row < theSq.length; row ++)
		{
			coltotal = coltotal + theSq [row][c];
		}
		return coltotal;
		
	}
	
	private int rowSum(int r) {
		int rowtotal = 0; 
		
		for (int column = 0; column < theSq[0].length; column ++)
		{
			rowtotal = rowtotal + theSq[r][column];
		}
	return rowtotal;
		
	}
	
	private int diag1() {
		int diagtot1 = 0;
		
		for (int n = 0; n < theSq[0].length; n ++)
		{
			diagtot1 = diagtot1 + theSq [n][n];
		}
	return diagtot1;
		
	}
	
	private int diag2() {
		int diagtot2 = 0;
		int row = 0; 
		
			for (int col = theSq[0].length-1; col >=0; col --)
			{
				diagtot2 = diagtot2 + theSq [row][col];
				row++;
			}
		return diagtot2;
	}
	
	private boolean valuesCheck() {
		int found = 0; 
		int check = 0;
		for (int r=0; r < theSq.length; r ++)
		{
			for (int c = 0; c< theSq[0].length; c++)
			{
				check = theSq [r][c];
				found = 0;
				
				for (int rr = 0; rr < theSq.length; rr++)
				{
					for (int cc= 0; cc < theSq[0].length; cc++)
					{
						
						if (check == theSq[rr][cc] || theSq[r][c] > Math.pow(theSq.length, 2) || theSq[r][c] < 1)
						{
							
							found ++;
						}
						if (found > 1)
						{
							
							return false;
						}
						if (check < 1 || check > (theSq.length * theSq.length)) {
							
						
						return false;
						}
					}
				}
			}
		}
		return true;
		
	}

	private int ULSum() {
		int sum = 0;
		sum = theSq[0][0] + theSq[0][1] + theSq[1][0] + theSq[1][1];
		return sum;
	}
	private int LLSum() {
		int sum = 0;
		sum = theSq[3][0] + theSq[3][1] + theSq[2][0] + theSq[2][1];
		return sum; 
	}
	private int URSum() {
		int sum = 0; 
		sum = theSq[0][3] + theSq[0][2] + theSq[1][3] + theSq[1][2];
		return sum; 
	}
	private int LRSum() {
		int sum = 0; 
		sum = theSq[3][3] + theSq[3][2] + theSq[2][3] + theSq[2][2];
		return sum;
	}
	private int topBottomCenterCells() {
		int sum = 0;
		sum = theSq[0][1] + theSq[0][2] + theSq[3][1] + theSq[3][2];
		return sum;
	}
	private int leftRightCenterCells() {
		int sum = 0; 
		sum = theSq[1][0] + theSq[2][0] + theSq[1][3] + theSq[2][3];
		return sum; 
	}
	
	public String toString() {
		String a = "";
		for (int r=0; r < theSq.length; r++)
		{
			for (int c=0; c<theSq[0].length; c++)
			{
				a += theSq[r][c] + " ";
			}
			a+= "\n";
		}
		return a;
		
	}
	
	
}

