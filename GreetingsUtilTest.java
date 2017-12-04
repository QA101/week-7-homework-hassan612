import static org.junit.Assert.*;

import org.junit.*;

public class GreetingsUtilTest {
	
		 
		 	static GreetingsUtilTest gu;
		 	String actual;
		 	String  expected;
			public String currentState;
		 	
		 	
		 	@BeforeClass
		  	public static void setUpBeforeClass(String[] strings) throws Exception {
		 		gu = new GreetingsUtilTest();
		 		
		  	}
		  	  	 	
		  	@Before
		 	public void setUp() throws Exception {
		 		
		 	}
		 		 
		 	
		  	@Test
		  	
		  	 	public void test1() {
		  		 		String expected = "coming";
		  		 		String actual = gu.currentState;
		  		 		assertTrue("Expected: " + expected + " Actual: "+actual, expected.equals(actual));
		  		 		
		  		 		String expected1 = "coming";
		  		 		gu.test1();
		  		 		String actual1 = "85348";
		  		 		assertFalse("Expected: " + expected1 + " Actual: "+actual1, expected1.equals(actual1));
		  		 		
		  		 		String expected2 = "coming";
		  		 		gu.test1();
		  		 		String actual2 = "नमस्ते";
		  		 		assertFalse("Expected: " + expected2 + " Actual: "+actual2, expected2.equals(actual2));
		  		 		
		  		 		String expected3 = "coming";
		  		 		gu.test1();
		  		 		String actual3 = "!@#$%^&*";
		  		 		assertFalse("Expected: " + expected3 + " Actual: "+actual3, expected3.equals(actual3));
		  		 		
		  		 		String expected4 = "coming";
		  		 		gu.test1();
		  		 		String actual4 = null;
		  		 		assertFalse("Expected: " + expected4 + " Actual: "+actual4, expected4.equals(actual4));
		  		 		
		  		 		String expected5 = "coming";
		  		 		gu.test1();
		  		 		String actual5 = "    ";
		  		 		assertFalse("Expected: " + expected5 + " Actual: "+actual5, expected5.equals(actual5));
		  		 		
		  		 		String expected6 = "coming";
		  		 		gu.test1();
		  		 		String actual6 = "COMING";
		  		 		assertFalse("Expected: " + expected6 + " Actual: "+actual6, expected6.equals(actual6));
		  		 		
		  		 		expected = "going";
		  		 		gu.test1();
		  		 		actual = gu.currentState;
		  		 		assertTrue("Expected: " + expected + " Actual: "+actual, expected.equalsIgnoreCase(actual));
		  		 		
		  		 		expected1 = "coming";
		  		 		gu.test1 ();
		  		 		actual = gu.currentState;
		  		 		assertTrue("Expected:" + expected + " Actual: "+actual, expected1.equals(actual));
		  		 	}
		  		 	
		  		 		  		  	  		  	
		  	

			@After
		 	public void tearDown() throws Exception {
		 	}
		  
		  
		  	@AfterClass
		 	public static void tearDownAfterClass() throws Exception {
		 	}
		 
		  }