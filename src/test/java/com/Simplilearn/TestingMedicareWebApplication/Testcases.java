package com.Simplilearn.TestingMedicareWebApplication;

import org.testng.annotations.Test;
@Test
public class Testcases {
	
	
	@Test(priority = 1)
	public class testcase001 extends Registrationpage{
		@Test
		public void singup() throws InterruptedException{
			
			Registrationpage obj = new testcase001();
			obj.amttosinguppage();
		}
	}
	
	@Test(priority = 2)
	 public class testcase002 extends LoginPage{
		 @Test
		 public void loginPage() throws InterruptedException{
			 
			 LoginPage obj = new testcase002();
			 obj.loginpage();
		 }
		 
	 }
	 @Test(priority = 3)
	  public class testcase003 extends Homepage{
		  @Test
		  public void homePage() throws InterruptedException{
		   
			  Homepage obj = new testcase003();
			  obj.homepage();
		  }
		  
	  }
	  @Test(priority = 4)
	   public class testcase004 extends contactpage{
		   @Test
		   public void contact() throws InterruptedException{
			   
			   contactpage obj = new testcase004();
			   obj.contacts();
		   }
		   
	   }
	    
	  @Test(priority = 5)
	     public class testcase005 extends Aboutpage{
	    	 @Test
	    	 public  void descr() throws InterruptedException{
	    		 
	    		 Aboutpage obj = new testcase005();
	    		 obj.description();
	    	 }
	     }
	  
	     @Test(priority = 6)
	      public class testcase006 extends ListProduct{
	    	  @Test
	    	  public  void productlist() throws InterruptedException{
	    		  
	    		  ListProduct obj = new testcase006();
	    		  obj.product();
	    	  }
	      }
          	 @Test(priority = 7)
	        public class testcase007 extends Addtocart{
	        	@Test
	        	public void addtocart() throws InterruptedException{
	        		
	        	  Addtocart obj = new testcase007();
	        	  obj.add();
	        	}
	        }
	   
	   
	  
	   

}
 