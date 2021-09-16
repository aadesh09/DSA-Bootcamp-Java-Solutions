package com.aadesh;

import java.util.Scanner;

public class PatternFinal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int patno,n;
		System.out.println("Enter Pattern number");
		patno = in.nextInt();
		System.out.println("Enter number of rows");
		n = in.nextInt();
		
		switch (patno) {
		case 0:
			allpattern(n);
			break;
		case 1:
			pattern1(n);
			break;
		case 2:
			pattern2(n);
			break;
		case 3:
			pattern3(n);
			break;
		case 4:
			pattern4(n);
			break;
		case 5:
			pattern5(n);
			break;
		case 6:
			pattern6(n);
			break;
		case 7:
			pattern7(n);
			break;
		case 8:
			pattern8(n);
			break;
		case 9:
			pattern9(n);
			break;
		case 10:
			pattern10(n);
			break;
		case 11:
			pattern11(n);
			break;
		case 12:
			pattern12(n);
			break;
		case 13:
			pattern13(n);
			break;
		case 14:
			pattern14(n);
			break;
		case 15:
			pattern15(n);
			break;
		case 16:
			pattern16(n);
			break;
		case 17:
			pattern17(n);
			break;
		case 18:
			pattern18(n);
			break;
		case 19:
			pattern19(n);
			break;
		case 20:
			pattern20(n);
			break;
		case 21:
			pattern21(n);
			break;	
		case 22:
			pattern22(n);
			break;
		case 23:
			pattern23(n);
			break;
		case 24:
			pattern24(n);
			break;
		case 25:
			pattern25(n);
			break;
		case 26:
			pattern26(n);
			break;
		case 27:
			pattern27(n);
			break;
		case 28:
			pattern28(n);
			break;
		case 29:
			pattern29(n);
			break;
		case 30:
			pattern30(n);
			break;
		case 31:
			pattern31(n);
			break;
		case 32:
			pattern32(n);
			break;
		case 33:
			pattern33(n);
			break;
		case 34:
			pattern34(n);
			break;

		default:
			System.out.println("Please Enter Value of pattern from 1 to 24");
			break;
		}

		
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
	
	static void allpattern(int n) {
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern9(n);
		pattern10(n);
		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern14(n);
		pattern15(n);
		pattern16(n);
		pattern17(n);
		pattern18(n);
		pattern19(n);
		pattern20(n);
		pattern21(n);
		pattern22(n);
		pattern23(n);
		pattern24(n);
		pattern25(n);
		pattern26(n);
		pattern27(n);
		pattern28(n);
		pattern29(n);
		pattern30(n);
		pattern31(n);
		pattern32(n);
		pattern33(n);
		pattern34(n);
	}
	

}
