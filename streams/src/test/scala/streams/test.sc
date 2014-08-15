package streams

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
	
  }
//	Level1.startPos
//	Level1.goal
	
	println(Level1.pathsFromStart.take(6).toList)
                                                  //> List((Block(Pos(1,1),Pos(1,1)),List()), (Block(Pos(1,2),Pos(1,3)),List(Right
                                                  //| )), (Block(Pos(2,1),Pos(3,1)),List(Down)), (Block(Pos(1,4),Pos(1,4)),List(Ri
                                                  //| ght, Right)), (Block(Pos(2,2),Pos(2,3)),List(Down, Right)), (Block(Pos(2,2),
                                                  //| Pos(3,2)),List(Right, Down)))
                                                  
 	Level1.solution                           //> res0: List[streams.test.Level1.Move] = List(Right, Right, Down, Right, Right
                                                  //| , Right, Down)
 	
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
  }
  
  Level3.startPos                                 //> res1: streams.test.Level3.Pos = Pos(3,1)
  Level3.goal                                     //> res2: streams.test.Level3.Pos = Pos(3,13)
  
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