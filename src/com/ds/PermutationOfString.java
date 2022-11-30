package com.ds;

public class PermutationOfString {
    public static void main(String[] args) {
        String str="ABC";
        int n=str.length();
        PermutationOfString permutationOfString=new PermutationOfString();
        permutationOfString.permute(str,0,n-1);
    }
    private void permute(String str,int a,int b){
        if(a==b){
            System.out.println(str);
        }else {
            for(int i=a;i<=b;i++){
                str=swap(str,a,i);
                permute(str,a+1,b);
                str=swap(str,a+1,i);

            }
        }
    }
    public String swap(String c,int i,int j){
        char temp;
        char[]charArray= c.toCharArray();
        temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }

}
