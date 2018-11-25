package byun_pro;

import java.util.Scanner;

public class String_user
{
   public String input_user()
   {
	   
	  Scanner input_name=new Scanner(System.in);
	  System.out.println("input your Id");
	  
	  String Id=input_name.next("byun");
	  
//	  System.out.println("암호를 입력");
	  String Pw=input_name.next("byun01");
	  
	  
	  if(Id.equals("byun")&&Pw.equals("byun01"))
	  {
		  System.out.println("로그인에 성공");
	  }
	  else
	  {
		  System.out.println("다시해!");
	  }
	  String result=null;
	  return result;
   }
}
