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

      //*       *  1,2,3,4,5,6,7,8,9
      // *     *     2,3,4,5,6,7,8
      //  *   *        3,4,5,6,7
      //   * *           4,5,6
      //    *              5 
      //   * *           4,5,6
      //  *   *        3,4,5,6,7
      // *     *     2,3,4,5,6,7,8
      //*       *  1,2,3,4,5,6,7,8,9

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
}
