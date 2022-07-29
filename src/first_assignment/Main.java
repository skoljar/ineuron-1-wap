package first_assignment;

public class Main {

	public static void main(String[] args) {
		 firstTask();
		 secondTask();
		 thirdTask();
		 fourthTask();
		 fifthTask(); 
	 }
	 
	 public static void firstTask() {
		 System.out.println("First Task:\n");
		 
		 int n = 7;
		 
		 for(int i = 0; i < n; i++) {
			 
			 //I
			 for(int j = 0; j < n; j++) {
				 if(j==n/2) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //N
			 for(int j = 0; j < n; j++) {
				 if(j==0 || j==n-1 || i==j) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //E
			 for(int j = 0; j < n; j++) {
				 if(j==0 || i==0 || i==n-1 || i==n/2) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //U
			 for(int j = 0; j < n; j++) {
				 if(j==0 && i!=n-1 || j==n-1 && i!=n-1 || i==n-1 && j!=0 && j!=n-1) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //R
			 for(int j = 0; j < n; j++) {
				 if(j==0 || i==0 && j!=n-1 || i==n/2 && j!=n-1 || i!=0 && j==n-1 && i<n/2 || i>2 && i-j==0) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //O
			 for(int j = 0; j < n; j++) {
				 if(i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || i!=0 && j==0 && i!=n-1 || i!=0 && j==n-1 && i!=n-1) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 //N
			 for(int j = 0; j < n; j++) {
				 if(j==0 || j==n-1 || i==j) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("  ");
			 
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("==============");
	 }
	 
	 public static void secondTask() {
		 System.out.println("Second Task:\n");
		 
		 for(int i = 1; i < 5; i++) {
			 for(int j = 0; j < 4; j++) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("==============");
	 }
	 
	 public static void thirdTask() {
		 System.out.println("Third Task:\n");
		 
		 int n = 14;
		 
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n; j++) {
				 if(i == 0 || i+j <= (n/2)-1 || j-i >= (n/2)-1 || j == 0 || j == n-1 || i == n-1) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("==============");
	 }
	 
	 public static void fourthTask() {
		 System.out.println("Fourth Task:\n");
		 
		 int n = 14;
		 
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n; j++) {
				 if(i-j >= (n/2)-1 || j+i >= n+(n/2)-2) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("==============");
	 }
	 
	 public static void fifthTask() {
		 System.out.println("Fifth Task:\n");
		 
		 int n = 14;
		 
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n; j++) {
				 if(i+j <= (n/2)-1 || i-j >= (n/2)-1 || i==0 && j!=n-1 || i==n-1 && j!=n-1) {
					 System.out.print("*");
				 } else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("==============");
	 }
}

