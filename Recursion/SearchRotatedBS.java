package Recursion;

public class SearchRotatedBS {
    public static void main(String[] args) {
//        int [] ar = {5,6,7,8,9,10,11,12,13,1,2,3,4};
        int[] ao = {8,9,1,2,3,4,5,6,7};
        System.out.println("index is : "+search(ao,8,0,ao.length-1));

    }
    static int search(int[] arr,int t,int s, int e){
        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m] == t){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(t>=arr[s] && t<=arr[m]){
                return search(arr,t,s,m-1);
            }
            else{
                return search(arr,t,m+1,e);
            }
        }

        if(t>=arr[m] && t<=arr[e]){
            return search(arr,t,m+1,e);
        }
        else {
            return search(arr,t,s,m-1);
        }

    }
}
