//מימוש הטיפוס דלי של אורית רביד
public class Bucket 
{
	private int capacity;//קיבולת הדלי בליטרים
	private double currentAmount;//כמות המים אשר בפועל 
  
	
	//-------------------------------------------------
	public Bucket (int capacity)
	{
		this.capacity=capacity;
		this.currentAmount=0;
	}
	
	//-------------------------------------------------
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public double getCurrentAmount()
	{
		return this.currentAmount;
	}
	
	//-------------------------------------------------
	public void empty()
	{
		this.currentAmount=0;
	}
	
	public boolean isEmpty()
	{
		return this.currentAmount==0;
	}
	
	public void fill (double amountToFill)
	{
		if (this.currentAmount+amountToFill>this.capacity)
			this.currentAmount=this.capacity;
		else
			this.currentAmount=this.currentAmount+amountToFill;
	}
	
	public void pourInto (Bucket bucketInto)
	{
		double sum=this.currentAmount+bucketInto.getCurrentAmount();
		if (sum<=bucketInto.getCapacity())
		{
			bucketInto.fill(this.currentAmount);	
			this.currentAmount=0;			
		}
		else
		{
			double left=bucketInto.getCapacity()-bucketInto.getCurrentAmount();
			this.currentAmount=this.currentAmount-left;
			bucketInto.fill(left);
		}
	}
	
	public String toString()
	{
		return "The capacity: "+this.capacity+" The current amount of water: "+this.currentAmount;
	}
}//class

