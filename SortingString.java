import java.util.Comparator;
import java.util.Arrays;


public class SortingString{

 static void sort(final String[] strArr,final  String str)
    {
        Comparator<String> myComp = new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                for(int i = 0;
                        i < Math.min(a.length(),
                                    b.length()); i++)
                {
                    if (str.indexOf(a.charAt(i)) ==
                        str.indexOf(b.charAt(i)))
                    {
                        continue;
                    }
                    else if(str.indexOf(a.charAt(i)) >
                            str.indexOf(b.charAt(i)))
                    {
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
                }
                return 0;
            }
        };
        Arrays.sort(strArr, myComp);
    }


public static void main(String args[])
{

    StringSorting s = new StringSorting();
    String cualph="pybrxwuvncehkolfagjqszidmt" ;
    String arr[]={"boy" ,"your" ,"toy", "kkr" ,"krk" ,"rrr"}; 

    sort(arr,cualph);

    System.out.println("Element print:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }

}

}