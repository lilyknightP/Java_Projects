import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int T;
		T = scan.nextInt();
		//System.out.print("T is "+T);
		
		int[] Usage_goal = new int[T];
		int[] A = new int[9];
		int[] Usage_real = new int[T];
		
		for(int i = 0; i < T; ++i)
		{
			Usage_goal[i] = scan.nextInt();
			//System.out.print("Goal is"+Usage_goal[i]);
			
			for(int k = 0; k < 9; ++k)
			{
				A[k] = scan.nextInt();
				Usage_real[i] += A[k];
			}
			//System.out.print("real usage is "+Usage_real[i]);
			
			if(Usage_goal[i] >= Usage_real[i])
				System.out.print("YES\n");
			else
				System.out.print("NO\n");
		}
		
		
		
	}

}
