import java.util.Arrays; 
class Solution
{
    public static void main (String args[])
    {
        int [] array = new int [] {0,2,2,1,1};
        //int n=array.length;
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        } 
    }
}