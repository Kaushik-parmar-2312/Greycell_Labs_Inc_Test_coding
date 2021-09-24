import java.util.Scanner;
public class SortingString{
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);


  //  String arr[]=new String[n];
    String arr[]={"boy" ,"your" ,"toy", "kkr" ,"krk" ,"rrr"}; 

        int n=arr.length;  

    System.out.println("Enter all the Element :");
    for(int i=0;i<n ;i++) {
     //   arr[i]=in.nextline();
    }
    //sorting element
   for(int i = 0; i<n; i++)   
    {  
        for (int j = i+1; j<n; j++)   
        {  
            //compares each elements of the array to all the remaining elements  
            if(arr[i].compareTo(arr[j])>0)   
            {  
                //swapping array elements  
                String temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }  
    }  

    
    System.out.println("Element sorted:");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }

}

}