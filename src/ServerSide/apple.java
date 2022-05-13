package ServerSide;

public class apple {
	String name;
	int    transactionCount;
	int    totalItems;
	double totalDollars;
	int    numApples;
	int    numGrapes;
	int    numOranges;
	int    numPears;
	
	//
	// constructor
	//
	public apple (String n, int tr, int items, double val, int na, int ng, int no, int np)
	{
		name             = n;
		transactionCount = tr;
		totalItems       = items;
		totalDollars     = val;
		numApples        = na;
		numGrapes        = ng;
		numOranges       = no;
 		numPears         = np;
 	}

	public String toString()
	{
		return name + " : " + "   #Trans  = " + String.format("%-4d", transactionCount) 
		                    + "   #Items  = " + String.format("%-4d",  totalItems)
			                + "  Dollars  = " + String.format("%.2f", totalDollars)
			                + " #Apples   = " + String.format("%-4d", numApples)
			                + " #Grapes   = " + String.format("%-4d", numGrapes)
			                + " #Oranges  = " + String.format("%-4d", numOranges)
			                + " #Pears    = " + String.format("%-4d", numPears);
	}
	
	public String forFileOutput()
	{
		return name + "," + transactionCount + "," + totalItems + "," + String.format("%.2f", totalDollars) + 
				      "," + numApples + "," + numGrapes + "," + numOranges + "," + numPears;
	}
	
	
	
	//
	// put methods
	//
	public void incrementTrans()
	{
		transactionCount++;
	}
	
	public void addItems(int c)
	{
		totalItems = totalItems + c;
	}

	public void addDollars(double d)
	{
		totalDollars = totalDollars + d;
	}

	public void addApples(int c)
	{
		numApples = numApples + c;
	}
	
	public void addGrapes(int g)
	{
		numGrapes = numGrapes + g;
	}
	
	public void addOranges(int o)
	{
		numOranges = numOranges + o;
	}
	
	public void addPears( int p)
	{
		numPears = numPears + p;
	}
	
	
	//
	// get methods
	//
	public int getTransactions()
	{
		return transactionCount;
	}
	
	public int getItems()
	{
		return totalItems;
	}
	
	public double getDollars()
	{
		return totalDollars;
	}
	
	public int getApples()
	{
		return numApples;
	}
	
	public int getGrapes()
	{
		return numGrapes;
	}
	
	public int getOranges()
	{
		return numOranges;
	}
	
	public int getPears()
	{
		return numPears;
	}
}