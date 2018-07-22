
public class Lesson2 {

	public static void main(String[] args) {
		countDown(9);
	}

	//Prints out every number from 0 to a
	static void count(int a){
	   var count = 0;
	   while(count < a){
	      System.out.println(count);
	      count += 1; // same thing as count = count + 1
	   }
	}
	
	// print all the numbers from a to 0
	// This is called "recursion"
	static void countDown(int a) {
		if (a == 0) {
			return;
		}else {
			System.out.println(a);
			countDown(a-1);
		}
	}
	
	
	
	// Come back to this
	static boolean xor(boolean a, boolean b) {
		
		return !(a && b) && (a || b);
		// True, True
		// ! (true) && (true || true)
		// false && (true || true)
		// false && true
		// false
		
	}
	
	
	static boolean isEven(int a) {
		return a % 2 == 0;
	}
	
	static boolean isOdd(int a) {
		//return ! (a % 2 == 0);
		//return a % 2 == 1;
		return !isEven(a);
	}

	static String yepOrNope(boolean b, int x) {
		if (b) {
			if (x > 5) {
				return "Yep!";
			} else {
				return "Nope!";
			}
		} else {
			return "Nope!";
		}
	}
	static int alwaysFive() {
		return 5;
	}

	static int add(int a, int b) {
		var answer = a + b;
		System.out.println(answer);
		return answer;
	}

	static int sum(int a) {
		var sum = 0;
		while (!(a == 0)) {
			sum = sum + a;
			a = a - 1;
		}
		return sum;
	}

	// Write a method that computes multiplying every number from 1 to a
	static int product(int a) {
		var product = 1;
		while (!(a == 1)) {
			product = product * a;
			a = a - 1;
		}
		return product;
	}


}
