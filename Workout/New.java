package Workout;

public class New {
    public static void main(String[] args) {
        // int a[] = {1,2,3,4};
        // int sum=0;
        // for (int i=0;i<a.length;i++){
            
           
        //     sum+=a[i];
        //     System.out.println(sum+" ");

        // int x,y,z;
        // x=6;y=9;z=2;
        // if(x*z<y){
        //     y=y-z;
        //     z=x+z;
        // }
        // if(y%3==0){
        //     x=y/3;
        // }else{
        //     x=x+y;
        // }
        // System.out.println(x+y+z);
            
        // }
        // int i,j,sum=0;
        String str = "Java Program";
        System.out.println(str);
        
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
        String s4 = new String();
         int start=0;
        int end=0;
        int start1=0;
        int end1=0;
        for(int i=0;i<str.length();i++){
           
            if(str.charAt(i)=='J'){
                start=i;
                end=i+1+1;
                s1=str.substring(start, end);
                start1=i+2;
                end1=i+3+1;
                s2=str.substring(start1, end1);

            }
            start =0;
            end=0;
            start1=0;
            end1=0;
            if(str.charAt(i)=='P'){
                start=i;
                end=i+3;
                s3=str.substring(start, end);
                start1=i+3;
                end1=str.length()-1+1;
                s4=str.substring(start1, end1);

            }
        }
        System.out.println(s2+s1+" "+s4+s3);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);

        

    }

}
