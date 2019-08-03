package typeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class typeNumberTest {

	@Test
	public void testNumber()
	{
		int s=typeNumber.number(1);
		assertEquals(s,1);
	}//test the basic function
	
	@Test
	public void testNumber2()
	{
		int s=typeNumber.range(songc2);
		assertEquals(s,null);
		
		s=typeNumber.number(peter);
		assertEquals(s,null);


	}//test if user enter the words

	
	@Test
	public void testNumber4()
	{
		int s=typeNumber.range(1000000);
		assertEquals(s,0);
		
		int s1=typeNumber.range(-1000000);
		assertEquals(s1,0);


	}// if user enter a very big or small number

}
