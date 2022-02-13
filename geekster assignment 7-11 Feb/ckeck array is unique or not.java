

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static boolean areDistinct(Integer arr[])
    {
       
        Set<Integer> s =
                new HashSet<Integer>(Arrays.asList(arr));
        
        return (s.size() == arr.length);
    }
    
    public static void main(String[] args)
    {
        Integer[] arr = { 1, 2, 3, 2 };
        if (areDistinct(arr))
            System.out.println("All Elements are Distinct");
        else
            System.out.println("Not all Elements are Distinct");
    }
}
