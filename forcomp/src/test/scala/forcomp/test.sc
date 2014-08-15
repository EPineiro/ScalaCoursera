package forcomp

object test {

	import forcomp.Anagrams._
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
//  ("Emanuel" groupBy((elem: Char) => elem.toLower) map{ case(c, l) => (c, l.size)} toList) sorted
  
  val l = List("abc", "ea")                       //> l  : List[String] = List(abc, ea)
  
  l.mkString                                      //> res0: String = abcea
 
 
 //dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet)
 
 // wordAnagrams("player")
 
//  combinations(List(('a', 2), ('b', 2)))
                                                 
                                                
  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> x  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
	val y = List(('r', 1))                    //> y  : List[(Char, Int)] = List((r,1))
                                                  
// 	((y foldLeft x.toMap)((acc: Map[Char, Int], p:(Char, Int)) => acc updated(p._1, acc(p._1) - p._2)) toList) filterNot {case(x, y) => y == 0}
                                                  
  sentenceAnagrams(List("Yes", "man"))            //> res1: List[forcomp.Anagrams.Sentence] = List()
}