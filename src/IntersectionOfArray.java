import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int [] arr1={2,4,7,8,10,11,18};
        int [] arr2={3,5,6,7,10,13,16,18};
        ArrayList<Integer> arr3=new ArrayList<>();
        int i=0;
        int j=0;

        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            } else {
                arr3.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println("arr2:"+arr3);
    }
}
