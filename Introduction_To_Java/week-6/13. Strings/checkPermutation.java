import java.util.Scanner;

class checkPermutations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 String :");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2 String :");
        String str2 = sc.nextLine();
          
        boolean ans = check(str1 , str2);
           System.out.println(ans);
       }
   
       //  CHECK PERMUTATION  METHOD
   
       public static boolean check(String str1, String str2) {
   
           // MY THOUGHT OF SOLVING
        	int count [] = new int [26];

		boolean flag = true;

		for(int i = 0 ; i < str1.length() ; i++){
			count[str1.charAt(i) - 'a'] += 1;
		}

		for(int i = 0 ; i < str2.length() ; i++){
			count[str2.charAt(i) - 'a'] -= 1;
		}


		for(int i = 0 ; i < count.length; i++){
			if(count[i] !=0){
				flag = false;
			}

			
		}
		return flag;
           
           // SEEN SOLUTION

          // int count [] = new int [256];
		// boolean permutation = true;

		// for(int i = 0 ; i < str1.length() ; i++){
		// 	int charIndex = (int) str1.charAt(i);
		// 	count[charIndex] += 1;
		// }

		// for(int i  = 0 ; i < str2.length() ; i++){
		// 	int charIndex = (int) str2.charAt(i);
		// 	count[charIndex] -= 1;
		// }

		// for(int i = 0 ; i < count.length ; i++){
		// 	if(count[i] != 0){
		// 		permutation = false;
		// 	}
		// }

		// return permutation;
       }
   
       // TAKE INPUT METHOD
       public static int[] takeInput() {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number: ");
           int arr = sc.nextInt();
           int arr1[] = new int[arr];
           for (int i = 0; i < arr1.length; i++) {
               System.out.println("Enter element at " + i + "th index");
               arr1[i] = sc.nextInt();
           }
           return arr1;
       }
   
       // PRINT ARRAY METHOD
       public static void printArray(String[] arr) {
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
           }
       }
    }
