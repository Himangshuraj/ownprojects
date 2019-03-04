import java.util.*;
public class insertion {
 // https://stackoverflow.com/questions/22460266/linux-bash-for-loop-and-function-for-adding-numbers
  public static int[ ] insertion(int[ ] insert)
  {
    int i,j, total;
    
    for(i=1; i<insert.length; i++)
    {
      total=insert[i];//
      
      j=i-1;
      while (j>=0 && insert[j]>total) //looked at stack overflow 
      {
        insert[j+1]=insert[j];
        j--;
      }
      insert[j+1]= total;
    }
    return insert;
  }
 
  public static void main(String[] args)
  {
    System.out.println(Arrays.toString(insertion(new int[] {5,2,4,3,10,7,1,9,6,8})));

  }
}
    

