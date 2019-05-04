
public class myBasicsOfMethodsProgramsTest {
          public static void main(String args[])
          { int multi=0,marks=60;
        	  myBasicsOfMethodsPrograms obj=new myBasicsOfMethodsPrograms();
        	  System.out.println("");
        	  multi=obj.test3(marks);
        	  System.out.println("multiple of marks is"+multi);

        	       boolean Result=obj.test2(marks);
        	       System.out.println("boolean value is "+Result);

        	       String outcome=obj.test1(marks);
        	       System.out.println("Outcome value is "+outcome);
        	       
          }
}
