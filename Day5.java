import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        //*2D Array */
        
        //*Addition Of Matrix */
        // int a[][] = {{1,2},{3,4}};
        // int b[][] = {{5,6},{7,8}};
        // int c[][] = new int[2][2];

        // for (int i = 0; i < 2 ; i++ ) {
        //     for (int j =0 ; j < 2 ; j++) {
        //         c[i][j] =a[i][j]+b[i][j];
        //         System.out.print(c[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        // Transpose Matrix

        // int a[][] = {{1,2,3},{4,5,6}};
        // System.out.println("Original Matrix (A):");
        // for (int i=0;i<2;i++){
        //     for (int j=0;j<3;j++){
        //         System.out.print(a[i][j]+" ");

        //     }
        //     System.out.println("");
        // }

        // System.out.println("Transpose Matrix (At):");
        // for (int i=0;i<3;i++){
        //     for (int j=0;j<2;j++){
        //         System.out.print(a[j][i]+" ");

        //     }
        //     System.out.println("");
        // }

        //*String */

        // String s = "java";
        // System.out.println(s);

        //*Stack and Heap Clarification  For == vs equals()*/
        
        // String s1 =  "java";
        // String s2 =  "java";
        // String s3 =  "java";
        // String s4 = new String("java");
        // System.out.println(s1==s2); //Checks Memory Address
        // System.out.println(s3==s4);

        // System.out.println(s1.equals(s4));//Checks value

        //*BuiltIn Methods */

        // String s = "Wasim Akash";
        // for (int i = 0;i<s.length();i++){
        //     System.out.println(s.charAt(i));
        // }
        //  System.out.println(s.toUpperCase());

        //*Reverse String */

        // String rev ="";
        // for(int i=s.length()-1;i>=0;i--) {
        //     rev+=s.charAt(i);

        // }
        // System.out.println(rev);

        //length
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String :");
        // String s = sc.nextLine();
        // int count =0;
        // for (char ch : s.toCharArray()) {
        //     count++;
        // }
        // System.out.println(count);
        // int n = sc.nextInt();

        // *Count odd ,even

        // int [] a = new int[n];
        // for (int i=0;i<n;i++) {
        //     a[i] = sc.nextInt();
        // }
        // for (int i=0;i<n;i++) {
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println("");
        // int even =0;
        // int odd =0;
        // for (int i =0;i<n ;i++){
        //     if(a[i]%2==0)

        //     even++;
        //     else
        //     odd++;

        // }
        // System.out.println("even count:"+even);
        // System.out.println("odd count:"+odd);

        // *Palindrome
        // System.out.print("Enter a String :");
        // String str = sc.nextLine();
        // str=str.toLowerCase();  
        // String r ="";
        // for (int i=str.length()-1;i>=0;i-- ) {
        //     r+=str.charAt(i);
        // }
        // System.out.println(r);
        // if(str.equals(r)){
        //     System.out.println("Palindrome");

        // }
        // else{
        //     System.out.println("Not a Palindromr");
        // }

        System.out.print("Enter a String :");
        String str = sc.nextLine();
        int vowels = 0;

        for ( int i=0;i<str.length();i++) {
            if ((str.charAt(i)=='A') || (str.charAt(i)=='E')||(str.charAt(i)=='I')||
            (str.charAt(i)=='O')||(str.charAt(i)=='O')||(str.charAt(i)=='U')||
            (str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||
            (str.charAt(i)=='o')||(str.charAt(i)=='u')){
                vowels++;

            }
        
            
        }
        System.out.println("Vowels count :"+vowels);
            
            }

        




       

        }
        




       





    }
    

