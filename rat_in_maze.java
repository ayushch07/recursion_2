import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char arr[][]=new char[m][n];
       for(int i=0;i<arr.length;i++)
       { 
           String str=sc.next();
           for(int j=0;j<str.length();j++)
           {
               arr[i][j]=str.charAt(j);
           }
       }
       
       int a[][]=new int[m][n];
       path(arr,0,0,a);
       if(f == false) 
       System.out.println("NO PATH FOUND");
 

    }
    static boolean f = false; 
    public static void path(char arr[][], int cr, int cc,int a[][])
    {
        if(cr==arr.length-1 && cc==arr[0].length-1 && arr[cr][cc]!='X')
        { a[cr][cc]=1;
        f=true;
            display(a);
            return;
        }
        if(cr<0||cc<0||cr>=arr.length||cc>=arr[0].length||arr[cr][cc]=='X')
        return;
        arr[cr][cc]='X';
          a[cr][cc]=1;

        path(arr,cr-1,cc,a);
        
        path(arr,cr+1,cc,a);
        
        path(arr,cr,cc+1,a);
        
        path(arr,cr,cc-1,a);
        arr[cr][cc]='0';
        a[cr][cc]=0;
        
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }
}