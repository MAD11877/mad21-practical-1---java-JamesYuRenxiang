import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */ 
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int c = number;
    int [] a=new int[number];
    int [] b=new int[number];
    double sum = 0;
    for(int i = 0 ; i < number ; i++ ) 
    {
      a[i]=in.nextInt();
      
    }
    {
      for(int i=0;i<number;i++) 
      {   c = 1;
              if(a[i]==-1)
              b[i]=0;
              else
              {
                for(int j=i+1;j<number;j++) 
          {
        if(a[i]==a[j])
                      {
                          c++;
                          a[j]=-1;
                      }
                      
        
            }
                b[i]=c;
                }
                
        
      }
            int m=b[0];
            for(int i=1;i<number;i++) 
      {
          if(b[i]>=m)
                    m=b[i];   
        
      }

      for(int i=0;i<number;i++) 
      {
          if(b[i]==m)
                  System.out.println(a[i]);   
        
      }
    }
    
  }
}
