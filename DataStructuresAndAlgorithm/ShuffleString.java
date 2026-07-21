package DataStructuresAndAlgorithm;
import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int wordCount =0;
        int mid=0;
        int start=0;
        int end=0;
        int start1=0;
        int end1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                wordCount=i;
                mid=(i)/2;
                end=mid;
                String s1=str.substring(start,end);
                //System.out.println(s1);
                start1=mid;
                end1=i;
                String s2=str.substring(start1,end1);
                //System.out.println(s2);
                // System.out.println(s2+s1);
                start=0;end=0;start1=0;end1=0;mid=0;
                mid=(i+str.length())/2;
                start=i+1;
                end=mid;
                start1=mid;
                end1=str.length()-1;
                String s3=str.substring(start,end);
                String s4=str.substring(start1,end1);
                System.out.println(s2+s1+" "+s4+s3);
                


                
            }
            
            // if((str.charAt(i)==' ')&& (str.charAt(i+1=='[a-z]'))){
                

            }
        }

    }


