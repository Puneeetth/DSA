import java.util.*;
public class Occurances{

    // Remove All Occurrences of an Element in an Array

    public static int removeOccurances(List<Integer> list,int ele){
        int k = 0;
        int n = list.size();

        for(int i = 0;i < n;i++){
            if(list.get(i) != ele){
                swap(list, k, i);
                k++;
            }
        }
        return k;
        
       
    }
    public static void swap(List<Integer> list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        int ele = 2;
        System.out.println(removeOccurances(arr, ele));
    }
}