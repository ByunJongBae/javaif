package byun_pro;

import java.util.Scanner;

public class Scanner_plus
{
	public int main ()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("첫번째수를 입력");
		int input_0 =input.nextInt();
		
		System.out.println("두번째 수를 입력");
		int input_1=input.nextInt();
		
	    int result_Max =input_0+input_1; // 과목을 더한 최대값 
	    
	    System.out.println("result_Max 의 총합"+result_Max);
	    
	    int math =1; int languge=1; //과목의 수를 정함 "1"은 더하기 위한 값 
	    
	    int result_sub =math+languge; // 과목의 합계를 의미하는 변수 
	    System.out.println("result_sub 의 총합"+result_sub);
	    
	    int average =result_Max/result_sub; // 과목의 점수의 최대의 합계와 , 과목의 합계를 평균치로 나눈것 
	    System.out.println("average 의 평균"+average);
	    
	    if(average > 70)
	    {
	    	  System.out.println("당신의 평균학점은" +"A"+"입니다.");
	    }
	    else
	    {
	    	  System.out.println("당신의 평균학점은" +"B"+"입니다.");
	    }
	    	
	    
	    
	    return 0;
	    
	}
}
