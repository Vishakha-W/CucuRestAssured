
public class myBasicsOfMethodsPrograms {
          
	public void test()
	{
		System.out.println("In test method");
	}
	
    public String test1(int marks)
    {
    	System.out.println("In test1");
    	if(marks>50)
    	    return "passed";
    	    else 
    	    	return "failed";
    }
	
    public boolean test2(int marks)
    {
    	System.out.println("In test2 method");
    	if(marks>50)
    		return true;
    	else
    		return false;
    	
    }
    
    public  int test3(int marks)
    {
    	int multi=0;
    	multi=marks*marks;
    	return multi;
    }
	
}
