package lab5;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import balloon4.Balloon;
public class BalloonTests 
{
	private static final double EPSILON = 10e-07;
	
	private Balloon b;
	  @Before    
	    public void setup()  // runs before every test case
	    {
		  	b = new Balloon(5);
	    }
	    
		
	
	 @Test
	    public void testblow()
	    {
		 b.blow(3);
	      assertEquals(3, b.getRadius());
	    }

	    @Test
	    public void testdeflate()
	    {
	     b.deflate();
	      assertEquals(0, b.getRadius());
	    }

	    @Test
	    public void testradius()
	    {
	    
	      b.blow(5);
	      assertEquals(5, b.getRadius());
	    }

	    @Test
	    public void testpopped()
	    {
	      assertEquals(false, b.isPopped());
	    }
	    
	    @Test
	    public void testpop()
	    {
	    	b.pop();
	    	assertEquals(0,b.getRadius());
	    }
	    @Test
	    public void testdeflate2()
	    {
	    	b.deflate();
	    	assertEquals(false,b.isPopped());
	    }
	    @Test
	    public void popblow()
	    {
	    	b.pop();
	    	b.blow(4);
	    	assertEquals(0.0,b.getRadius(),EPSILON);
	    	
	    }
	    @Test
	    public void overinflate()
	    {
	    	b.blow(100);
	    	assertEquals(true, b.isPopped());
	    	assertEquals(0,b.getRadius());
	    }
	    @Test
	    public void blowtwice()
	    {
	    	b.blow(1);
	    	assertEquals(1,b.getRadius());
	    	b.blow(1);
	    	assertEquals(2,b.getRadius());
	    }
}
