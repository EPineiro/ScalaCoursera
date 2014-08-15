package streams

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet")
  
  import streams._
  
  object Level1 extends StringParserTerrain with Solver {
  	
  	val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin
      

  //val r = Block(Pos(1,1),Pos(1,1)).legalNeighbors
	
  };$skip(374); 
//	Level1.startPos
//	Level1.goal
	
	println(Level1.pathsFromStart.take(6).toList);$skip(69); val res$0 = 
                                                  
 	Level1.solution
 	
	/**
   * Level 3 of the official Bloxorz game
   */
  object Level3 extends StringParserTerrain {
    val level =
      """------ooooooo--
    	|oooo--ooo--oo--
        |ooooooooo--oooo
    	|oSoo-------ooTo
    	|oooo-------oooo
    	|------------ooo""".stripMargin
  };System.out.println("""res0: List[streams.test.Level1.Move] = """ + $show(res$0));$skip(297); val res$1 = 
  
  Level3.startPos;System.out.println("""res1: streams.test.Level3.Pos = """ + $show(res$1));$skip(14); val res$2 = 
  Level3.goal;System.out.println("""res2: streams.test.Level3.Pos = """ + $show(res$2))}
  
  /**
   * Level 6 of the official Bloxorz game
   */
  object Level6 extends StringParserTerrain with Solver {
    val level =
      """-----oooooo----
    	|-----o--ooo----
    	|-----o--ooooo--
    	|Sooooo-----oooo
    	|----ooo----ooTo
    	|----ooo-----ooo
    	|------o--oo----
    	|------ooooo----
    	|------ooooo----
    	|-------ooo-----
      """.stripMargin
  }

   /**
   * Level 11 of the official Bloxorz game
   */
  object Level11 extends StringParserTerrain {
    val level =
      """-oooo-------
    	|-oToo-------
    	|-ooo--------
    	|-o---oooooo-
    	|-o---oo--oo-
    	|Soooooo--ooo
    	|-----o-----o
    	|-----oooo--o
    	|-----ooooooo
    	|--------ooo-
      """.stripMargin
  }
  
}
