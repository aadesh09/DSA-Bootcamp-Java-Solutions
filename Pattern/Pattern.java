package com.aadesh;



public class Pattern {

	public static void main(String[] args) {
		pattern16(4);
	}

	
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pattern4(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int row=1;row<=2*n-1;row++) {
			if(row<=n) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			}
			else {
				for (int col = 1; col <= 2*n-row; col++) {
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=2*row-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern9(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=2*n-2*row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n) {
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern12(int n) {
		for(int row=1;row<=2*n;row++) {
			if(row<=n) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			}
			else {
				for(int col=1;col<=2*n-row;col++) {
					System.out.print(" ");
				}
				for(int col=1;col<=row-n;col++) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	
	static void pattern13(int n) {
		for(int row=1;row<=n-1;row++) {
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1;col<=2*row-3;col++) {
				System.out.print(" ");
			}
			if(row!=1) {
			System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	static void pattern14(int n) {
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("*");
		}
		System.out.println();
		int x=0;
		for(int row=2;row<=n;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int col=1;col<=2*n-5-x;col++) {
				System.out.print(" ");
			}
			if(row!=n) {
			System.out.print("*");
			}
			x+=2;
			System.out.println();
		}
		
	}
	
	static void pattern15(int n) {
		int x=0;
		for(int row=1;row<=2*n-1;row++) {
			if(row<=n) {
				for(int col=1;col<=n-row;col++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int col=1;col<=2*row-3;col++) {
					System.out.print(" ");
				}
				if(row!=1) {
				System.out.print("*");
				}
			}
			else {
				for(int col=1;col<=row-n;col++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int col=1;col<=2*n-5-x;col++) {
					System.out.print(" ");
				}
				if(row!=2*n-1) {
				System.out.print("*");
				x+=2;
				}
				
			}
			System.out.println();
		}
		
	}
	
	static void pattern16(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int col = 1; col <= n-row; col++) {
				System.out.print("  ");
			}
			
			for (int col = 1; col <= row; col++) {
				System.out.print(nCr(row-1,col-1)+"   ");
			}
			
			System.out.println();
		}
		
		  
	}
	
    static int nCr(int n, int r)   
    {   
          return fact(n) / (fact(r) * fact(n - r));   
    }   
    static int fact(int n)   
    {   
          int res = 1;   
          for (int i = 2; i <= n; i++)   
          res = res * i;   
          return res;   
    } 
    
	static void pattern161(int n) {
		 int coe=1;  
	     for(int i = 0; i < n; i++) {  
	            for(int space = 1; space < n - i; ++space) {  
	                System.out.print("  ");  
	            }  
	            
	  
	            for(int j = 0; j <= i; j++) {  
	                if (j == 0 || i == 0)  
	                    coe = 1;  
	                else  
	                    coe = coe * (i - j + 1) / j;  
	               // System.out.println("coe:"+coe);
	                System.out.printf("%4d", coe);  
	            }  
	      System.out.println();  
	        }   
	}
	
	
	static void pattern17(int n) {
		for (int row = 1; row <= 2*n-1; row++) {
			
			int space = row>n?row-n:n-row;
			
			for (int col = 1; col <= space; col++) {
				System.out.print(" ");
			}
			
			int c = row > n ? 2*n - row: row;
			for (int col = c ; col >=1 ; col--) {
				System.out.print(col);
			}
			for (int col =2; col<=c;col++) {
				System.out.print(col);
			}

			System.out.println();
			
		}                                                                                                                                                                                                                                                                                                                                                                           
	}
	
	static void pattern18(int n) {
		for (int row = 1; row <= 2*n; row++) {
			
			int c = row>n?row-n:n-row+1;
			for (int col = 1; col <=c ; col++) {
				System.out.print("*");
			}
			
			int space = row > n ? (2*n-row)*2 :(row-1)*2 ;
			for (int col = 1; col <= space; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= c; col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	static void pattern19(int n) {
		for (int row = 1; row <= 2*n-1; row++) {
			
			int c = row>n?2*n-row:row;
			for (int col = 1; col <=c ; col++) {
				System.out.print("*");
			}
			
			int space = row > n ? (row-n)*2 :(n-row)*2 ;
			for (int col = 1; col <= space; col++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= c; col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	static void pattern20(int n) {
		
		System.out.println("****");
		for (int row = 1; row <= n-2; row++) {
				System.out.println("*  *");
		}
		System.out.println("****");
	}
	
	static void pattern21(int n) {
		int j =1;
		for (int row = 1; row <=n ; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print(j+++" ");
			}
			System.out.println();
		}
	}
	static void pattern22(int n) {
		
		int j;
		for (int row = 1; row <=n ; row++) {
			j=row%2==0?0:1;
			for (int col = 1; col <= row; col++) {
				System.out.print(j+" ");
				j = j==0?1:0;
			}
			
			System.out.println();
		}
	}
	
static void pattern23(int n) {
		System.out.format("%"+(n-1)+"s", "");
		System.out.print("*");
		System.out.format("%"+(2*n-3)+"s", "");
		System.out.println("*");
		for (int row = 2; row <=n-1 ; row++) {
			System.out.format("%"+(n-row)+"s", "");
			System.out.print("*");
			System.out.format("%"+(2*row-3)+"s", "");
			System.out.print("*");
			System.out.format("%"+(2*n-2*row-1)+"s", "");
			System.out.print("*");
			System.out.format("%"+(2*row-3)+"s", "");
			System.out.println("*");
		}
		System.out.print("*");
		System.out.format("%"+(2*n-3)+"s", "");
		System.out.print("*");
		System.out.format("%"+(2*n-3)+"s", "");
		System.out.println("*");
	}

static void pattern231(int n) {
		System.out.format("%"+(n)+"s", "*");
		System.out.format("%"+(2*n-2)+"s%n", "*");
		for (int row = 2; row <=n-1 ; row++) {
			System.out.format("%"+(n-row+1)+"s", "*");
			System.out.format("%"+(2*row-2)+"s", "*");
			System.out.format("%"+(2*n-2*row)+"s", "*");
			System.out.format("%"+(2*row-2)+"s%n", "*");
		}
		System.out.format("*%"+(2*n-2)+"s", "*");
		System.out.format("%"+(2*n-2)+"s%n", "*");
}
	
static void pattern24(int n) {
	for (int row = 1; row <= 2*n; row++) {
		
			System.out.print("*");
		int c = row>n?2*n-row-1:row-2;
		for (int col = 1; col <=c ; col++) {
			System.out.print(" ");
		}
			if(row!=1 && row!=2*n) {
				System.out.print("*");
			}
		
		int space = row > n+1 ? (row-n-1)*2 :(n-row)*2 ;
		for (int col = 1; col <= space; col++) {
			System.out.print(" ");
		}
		
		System.out.print("*");
		for (int col = 1; col <=c ; col++) {
			System.out.print(" ");
		}
			if(row!=1 && row!=2*n) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	static void pattern25(int n) {
	
	for (int space = 1; space <= n-1; space++) {
			System.out.print(" ");
		}
	for (int first = 1; first <= n; first++) {
		System.out.print("*");
	}
	System.out.println();
	
	for (int row = 2; row <= n-1; row++) {
		for (int space = 1; space <= n-row; space++) {
			System.out.print(" ");
		}
			System.out.println("*  *");
	}
	for (int last = 1; last <= n; last++) {
		System.out.print("*");
	}
	System.out.println();
}
	
	static void pattern26(int n) {
		for (int row = 1; row <=n; row++) {
			for( int col =n-row+1; col >= 1; col--) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
	
	static void pattern27(int n) {
		int i = 1;
		int j = n * (n+1);
		for (int row = 1; row <=n; row++) {
			int k;
			for(int col=2;col<=row;col++) {
				System.out.print("  ");
			}
			
			for( int col =1; col <= n-row+1; col++) {
				System.out.print(i+++" ");
			}
			j = j-(n-row);
			k = j;
			for( int col =1; col <= n-row+1; col++) {
				System.out.print(j+++" ");
			}
			j=--k;
			System.out.println();
		}
	}
	
	
	static void pattern28(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int space= row>n?row-n:n-row;
			for(int col=1;col<=space;col++) {
				System.out.print(" ");
			}
			int star= row>n?2*n-row:row;
			for(int col=1;col<=star;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	static void pattern29(int n) {
		for (int row = 1; row <= 2*n-1; row++) {
			
			int c = row>n?2*n-row:row;
			for (int col = 1; col <=c ; col++) {
				System.out.print("*");
			}
			
			int space = row > n ? (row-n)*2 :(n-row)*2 ;
			for (int col = 1; col <= space; col++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= c; col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	static void pattern30(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n-row; col++) {
				System.out.print("  ");
			}

			for (int col = row ; col >=1 ; col--) {
				System.out.print(col+" ");
			}
			for (int col =2; col<=row;col++) {
				System.out.print(col+" ");
			}
			
			System.out.println();
			
		}                                                                                                                                                                                                                                                                                                                                                                           
	}
	
	static void pattern31(int n) {
		for(int row=1;row<=2*n-1;row++) {
			
			
			for(int col=1;col<=2*n-1;col++) {
				int d = n- Math.min(Math.min(row-1, col-1), Math.min(2*n-1-row, 2*n-1-col));
				System.out.print(d+" ");
			}
			
			System.out.println();
		}
	}
	
	static void pattern32(int n) {
		
		for(int row=1;row<=n;row++) {
			char c ='A';
			c = (char) (c+ n-row);
			for(int col=1;col<=row;col++) {
				
				System.out.print(c+" ");
				c++;
			}
			
			System.out.println();
		}
	}
	
static void pattern33(int n) {
		int i=1;
		char c ='a';
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print(c+" ");
				if(i%2!=0) {
					c = (char) (c-32+1);
				}
				else {
					c = (char) (c+32+1);
				}
				i++;
			}
			
			System.out.println();
		}
	}
	
static void pattern34(int n) {
		
		for(int row=1;row<=n;row++) {
			char c ='A';
			c = (char) (c+ n-row);
			for(int col=1;col<=n-row+1;col++) {
				
				System.out.print(c+" ");
				c--;
			}
			
			System.out.println();
		}
	}

}
