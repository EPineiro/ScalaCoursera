package example

object factorial {
 
	def fact(n: Int): Int = {
	
		if(n <= 0) 1
		else n * fact(n-1)
	}                                         //> fact: (n: Int)Int
	
	fact(3)                                   //> res0: Int = 6
	fact(4)                                   //> res1: Int = 24
	
	def fact2(n: Int) = {
	
		def factTail(n: Int, acum: Int): Int = {
		
			if(n <= 1) acum
			else factTail(n - 1, n * acum)
		}
		
		factTail(n, 1);
	}                                         //> fact2: (n: Int)Int
	
	fact2(3)                                  //> res2: Int = 6
	fact2(4)                                  //> res3: Int = 24
}