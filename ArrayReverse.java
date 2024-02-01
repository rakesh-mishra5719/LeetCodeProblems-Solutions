public class ArrayReverse {
    public static int[] reverse(int arr[]){
        int p = 0;
        int q = arr.length -1;
        int temp;
        for(int i = 0;i<arr.length /2;i++){
            temp  = arr[q];
            arr[q]  = arr[p];
            arr[p] = temp;
            p++;
            q--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int res[] = reverse(arr);
        for(int i  =0 ; i< res.length;i++){
            System.out.print(res[i]);
        }
        
    }
}
