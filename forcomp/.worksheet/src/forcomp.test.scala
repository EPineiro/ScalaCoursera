package forcomp

object test {

	import forcomp.Anagrams._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
	
  println("Welcome to the Scala worksheet");$skip(134); 
  
//  ("Emanuel" groupBy((elem: Char) => elem.toLower) map{ case(c, l) => (c, l.size)} toList) sorted
  
  val l = List("abc", "ea");System.out.println("""l  : List[String] = """ + $show(l ));$skip(16); val res$0 = 
  
  l.mkString;System.out.println("""res0: String = """ + $show(res$0));$skip(312); 
 
 
 //dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet)
 
 // wordAnagrams("player")
 
//  combinations(List(('a', 2), ('b', 2)))
                                                 
                                                
  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1));System.out.println("""x  : List[(Char, Int)] = """ + $show(x ));$skip(24); 
	val y = List(('r', 1));System.out.println("""y  : List[(Char, Int)] = """ + $show(y ));$skip(285); val res$1 = 
                                                  
// 	((y foldLeft x.toMap)((acc: Map[Char, Int], p:(Char, Int)) => acc updated(p._1, acc(p._1) - p._2)) toList) filterNot {case(x, y) => y == 0}
                                                  
  sentenceAnagrams(List("Yes", "man"));System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
}
