package String;

public class SortCharacterGiveString {
    public static void main(String[] args){
        String str="rock";
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(arr);
    }
}
