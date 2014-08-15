package objsets

object tweets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@17e8c5b
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@1ba0281
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@120a9d6
  val c = new Tweet("c", "c body", 7)             //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val set4c = set3.incl(c)                        //> set4c  : objsets.TweetSet = objsets.NonEmpty@16e2b70
  val set4d = set3.incl(d)                        //> set4d  : objsets.TweetSet = objsets.NonEmpty@1e5d007
  val set5 = set4c.incl(d)                        //> set5  : objsets.TweetSet = objsets.NonEmpty@bc8f01
  val set6 = set5.incl(new Tweet("e", "e body", 30))
                                                  //> set6  : objsets.TweetSet = objsets.NonEmpty@1509443
                                                  
  println(set6.mostRetweeted)                     //> User: e
                                                  //| Text: e body [30]
  println(set5.mostRetweeted)                     //> User: a
                                                  //| Text: a body [20]
                                                  
  lazy val trending: TweetList = set6.descendingByRetweet
                                                  //> trending: => objsets.TweetList
  
  trending foreach println                        //> User: e
                                                  //| Text: e body [30]
                                                  //| User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
                                                  //| User: d
                                                  //| Text: d body [9]
                                                  //| User: c
                                                  //| Text: c body [7]
}