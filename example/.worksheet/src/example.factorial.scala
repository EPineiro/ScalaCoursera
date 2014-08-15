package example

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
 
	def fact(n: Int): Int = {
	
		if(n <= 0) 1
		else n * fact(n-1)
	};System.out.println("""fact: (n: Int)Int""");$skip(11); val res$0 = 
	
	fact(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	fact(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(154); 
	
	def fact2(n: Int) = {
	
		def factTail(n: Int, acum: Int): Int = {
		
			if(n <= 1) acum
			else factTail(n - 1, n * acum)
		}
		
		factTail(n, 1);
	};System.out.println("""fact2: (n: Int)Int""");$skip(12); val res$2 = 
	
	fact2(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
	fact2(4);System.out.println("""res3: Int = """ + $show(res$3))}
}
