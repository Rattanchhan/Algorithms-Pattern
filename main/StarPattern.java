package main;
public class StarPattern {
    public static void pattern1(){
      //*
      //**
      //***
      //****
      //*****
			int i;
			int j;
			int n=5;
			for(i=1;i<=n;i++){
					for(j=0;j<i;j++){
							System.out.print("*");
					}
					System.out.println();
			}
    }
    public static void pattern2(){
      //*****
      //****
      //***
      //**
      //*
			int i;
			int j;
			int n=5;
			for(i=0;i<n;i++){
					for(j=i;j<n;j++){
							System.out.print("*");
					}
					System.out.println();
			}
    }
    public static void pattern3(){
      //*
      //**
      //***
      //****
      //*****
      //****
      //***
      //**
      //*
			int i;
			int j;
			int n=5;
			for(i=1;i<=(n*2)-1;i++){
          if(i>=n+1){
            for(j=i-n;j<n;j++){
							System.out.print("*");
					  }
          }
          else{
              for(j=1;j<=i;j++){
                System.out.print("*");
            }
          }
					System.out.println();
			}
    }
    public static void pattern4(){
      //*****
      // ****
      //  ***
      //   **
      //    *
			int i;
			int j;
			int n=5;
			for(i=1;i<=n;i++){
					for(j=i;j<n;j++) System.out.print(" ");
          for(j=0;j<i;j++) System.out.print("*");
					System.out.println();
			}
    }
    public static void pattern5(){
      //    *
      //   **
      //  ***
      // ****
      //*****
			int i;
			int j;
			int n=5;
			for(i=1;i<=n;i++){
					for(j=1;j<i;j++) System.out.print(" ");
          for(j=i;j<=n;j++) System.out.print("*");
					System.out.println();
			}
    }
    public static void pattern6(){
      //    *
      //   **
      //  ***
      // ****
      //*****
      // ****
      //  ***
      //   **
      //    *
			int i;
			int j;
			int n=5;
			for(i=1;i<=(n*2)-1;i++){
          if(i>=n+1){ 
            for(j=1;j<=i-n;j++) System.out.print(" ");
            for(j=i-n;j<n;j++) System.out.print("*");
          }
          else{
            for(j=i;j<n;j++) System.out.print(" ");
            for(j=1;j<=i;j++) System.out.print("*");
          }
					
					System.out.println();
			}
    }
    public static void pattern7(){
      //     *
      //    * *    
      //   * * *
      //  * * * *
      // * * * * *
			int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
          for(j=i;j<=n;j++) System.out.print(" ");
          for(k=1;k<=i;k++) System.out.print(" *");
					System.out.println();
			}
    }
    public static void pattern8(){
      //     *
      //    ***    
      //   *****
      //  *******
      // *********
			int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
          for(j=i;j<=n;j++){
            System.out.print(" ");
          }
          for(k=1;k<=(2*i-1);k++){
            System.out.print("*");
          }		
					System.out.println();
			}
    }
    public static void pattern9(){
      // *********
      //  *******    
      //   *****
      //    ***
      //     *
			int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
          for(j=1;j<i;j++){
            System.out.print(" ");
          }
          for(k=(i*2-1);k<=(2*n-1);k++){
            System.out.print("*");
          }		
					System.out.println();
			}
    }
    public static void pattern10(){
      // *
      //  *  
      //   *
      //    *
      //     *
			int i;
			int j;
			int n=5;
			for(i=1;i<=n;i++){
          for(j=1;j<i;j++){
            System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
			}
    }
    public static void pattern11(){
      //     *
      //    *
      //   *
      //  *
      // *
			int i;
			int j;
			int n=5;
			for(i=1;i<=n;i++){
          for(j=i;j<n;j++){
            System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
			}
    }
    public static void pattern12(){
      //     *
      //    * *
      //   *   *
      //  *     *
      // *       *
			int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
        for(j=i;j<=n;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for(k=2;k<(2*i-1);k++){ 
          System.out.print(" ");
        }
        if(i>1) System.out.print("*");
        System.out.println();
      }
    }
    public static void pattern13(){
      // *       *
      //  *     * 
      //   *   *
      //    * *
      //     *
			int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for(k=(2*i-1);k<=2*n-3;k++){ 
          System.out.print(" ");
        }
        if(i<n)System.out.print("*");
        System.out.println();
      }
    }
    public static void pattern14(){

      //*       *  
      // *     *
      //  *   *
      //   * *
      //    *           
      //   * *       
      //  *   * 
      // *     * 
      //*       *

      int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for(k=(2*i-1);k<=2*n-3;k++){ 
          System.out.print(" ");
        }
        if(i<n)System.out.print("*");
        System.out.println();
      }

      for(i=2;i<=n;i++){
        for(j=i;j<=n;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for(k=2;k<(2*i-1);k++){ 
          System.out.print(" ");
        }
        if(i>1) System.out.print("*");
        System.out.println();
      }
    }
    public static void pattern15(){

      //*****
      //*   *
      //*   *
      //*   *
      //*****

      int i;
			int j;
      int k;
			int n=5;
			for(i=1;i<=n;i++){
        if(i==1 || i==n){
          for(j=1;j<=n;j++) System.out.print("*");
        }
        else{
          if(i>1 && i<n){
            for(k=1;k<=n;k++){
              if(k==1 || k==n) System.out.print("*");
              else System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }
    public static void pattern16(){

      //**********   10 0*2
      //****  ****   8  1*2
      //***    ***   6  2*2
      //**      **   4  3*2
      //*        *   2  4*2

      int i;
			int j;
      int k;
			int n=5;
			for(i=0;i<n;i++){
          if(i*2==0){
            for(j=1;j<=n*2;j++) System.out.print("*");
          }
          else{
            for(k=1;k<=n*2;k++){
              if(k<=(2*n-(i*2))/2 || k > ((2*n-(i*2))/2) + i*2) System.out.print("*");
              else System.out.print(" ");
            }
          }
        System.out.println();
      }
    }
    public static void pattern17(){

      //     1
      //   1 2 1
      //  1 2 3 1  
      // 1 2 3 4 1
      //1 2 3 4 5 1

      int i;
			int j;
      int k;
			int n=10;
      int m=n;
			for(i=1;i<=n;i++){
         if(i==1) m=n+1;
         for(j=i;j<=m;j++) System.out.print(" ");
         for(k=1;k<=i;k++) System.out.print(" "+k);
         if(i>1) System.out.print(" 1");
         m=n;
        System.out.println();
      }
    }
    public static void pattern18(){

      //    A
      //   ABA
      //  ABCBA 
      // ABCDCBA
      //ABCDEDCBA

      int i;
      int j;
      int l;
      int k;
      int n= 5;
      int m = 0;
      int digit = 65;
      for(i=1;i<=n;i++){ 
        for(k=i;k<=n;k++) System.out.print(" ");
        for(j=0;j<i;j++){
          m+=1;
          System.out.print((char)(digit+j));
        } 
        for(l=1;l<m;l++) System.out.print((char)((digit+m-1)-l));
        m=0;
        System.out.println();
      }
    }
    public static void pattern19(){

      //      *
      //      *
      //  * * * * *
      //      *
      //      *

      int i;
      int j;
      int k;
      int n= 7;
      for(i=1;i<=n;i++){ 
        if(i==(n/2)+1){
          for(j=0;j<n-1;j++) System.out.print(" *");
          System.out.print(" ");
        } 
        else for(k=0;k<n;k++) System.out.print(" ");
        System.out.println("*");
      }
    }
    public static void pattern20(){

      //  o o x o o
      //  o o x o o
      //  x x x x x
      //  o o x o o
      //  o o x o o

      int i;
      int j;
      int k;
      int n= 5;
      for(i=1;i<=n;i++){ 
        if(i==(n/2)+1){
          for(j=0;j<n;j++) System.out.print("x ");
          System.out.print(" ");
        } 
        else {
          for(k=1;k<=n;k++){
            if(k==(n/2)+1) System.out.print("x ");
            else System.out.print("o ");
          }
        }
        System.out.println();
      }
    }
    public static void pattern21(){

      //  o x x x x
      //  x o x x x
      //  x x o x x
      //  x x x o x
      //  x x x x o

      int i;
      int j;
      int k;
      int n= 5;
      for(i=1;i<=n;i++){ 
        for(j=1;j<=n;j++){
          if(j==i) System.out.print("o ");
          else System.out.print("x ");
        }
        System.out.println();
      }
    }
    public static void pattern22(){

      //  x o o o x      
      //  o x o x o   
      //  o o x o o      
      //  o x o x o      
      //  x o x o x      


      int i;
      int j;
      int k;
      int n= 5;
      for(i=0;i<n;i++){ 
        if(i==(n/2)){
          for(k=0;k<n;k++){
            if(k==(n/2)) System.out.print("x ");
            else System.out.print("o ");
          }
        }
        else{
          for(j=0;j<n;j++){
            if(j==i || j==n-i-1) System.out.print("x ");
            else System.out.print("o ");
          }
        }
        System.out.println();
      }
    }
    public static void pattern23(){

      //  x x x x x      
      //  x # # # x  
      //  x # # # x   
      //  x # # # x    
      //  x x x x x    

      int i;
      int j;
      int k;
      int n= 5;
      for(i=0;i<n;i++){ 
         if(i==0 || i==n-1) for(j=0;j<n;j++) System.out.print("x ");
         else {
          for(k=0;k<n;k++){
            if(k==0 || k==n-1) System.out.print("x ");
            else System.out.print("o ");
          }
         }
        System.out.println();
      }
    }
    public static void pattern24(){

      //  ABCDEFGHIJKJIHGFEDCBA    0
      //  ABCDEFGHIJ JIHGFEDCBA    1
      //  ABCDEFGHI   IHGFEDCBA    3
      //  ABCDEFGH     HGFEDCBA    5
      //  ABCDEFG       GFEDCBA    7
      //  ABCDEF         FEDCBA    9
      //  ABCDE           EDCBA    11
      //  ABCD             DCBA    13
      //  ABC               CBA    15
      //  AB                 BA    17
      //  A                   A    19

      int i;
      int j;
      int k;
      int m=0;
      int l;
      int n= 11;
      int digit = 65;
      for(i=0;i<n;i++){
          for(j=0;j<n-i;j++){
            m+=1;
            System.out.print((char)(digit+j));
          }
          for(l=0;l<(2*i-1);l++) System.out.print(" ");
          for(k=0;k<m;k++) System.out.print((char)((digit+m-1)-k));
          m=0;
          System.out.println();
      }
    }
}

