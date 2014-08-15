package patmat

object huffmanWorksheet {

	import patmat.Huffman._
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l1 = List('a', 'b', 'a', 'b', 'b', 'c')     //> l1  : List[Char] = List(a, b, a, b, b, c)
  val l2 = string2Chars("Hello-World")            //> l2  : List[Char] = List(H, e, l, l, o, -, W, o, r, l, d)
  
  val freqs = times(l1)                           //> freqs  : List[(Char, Int)] = List((a,2), (b,3), (c,1))
  
  val orderedList = makeOrderedLeafList(freqs)    //> orderedList  : List[patmat.Huffman.Leaf] = List(Leaf(c,1), Leaf(a,2), Leaf(b
                                                  //| ,3))
  
  val combined = combine(Huffman.combine(orderedList))
                                                  //> combined  : List[patmat.Huffman.CodeTree] = List(Fork(Leaf(b,3),Fork(Leaf(c,
                                                  //| 1),Leaf(a,2),List(c, a),3),List(b, c, a),6))
  val tree = createCodeTree(l1)                   //> tree  : patmat.Huffman.CodeTree = Fork(Leaf(b,3),Fork(Leaf(c,1),Leaf(a,2),Li
                                                  //| st(c, a),3),List(b, c, a),6)
                                                  
 
  type Bit = Int
  
 
  val l3 = List('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
                                                  //> l3  : List[Char] = List(a, a, a, a, a, a, a, a, b, b, b, c, d, e, f, g, h)
  //val tree2 = createCodeTree(l3)
                                                  
  val tree2 = Fork(Leaf('a',8), Fork(Fork(Leaf('b', 3), Fork(Leaf('c', 1), Leaf('d', 1), List('c', 'd'), 2), List('b', 'c', 'd'), 5), Fork(Fork(Leaf('e', 1), Leaf('f', 1), List('e', 'f'), 2), Fork(Leaf('g', 1), Leaf('h', 1), List('g', 'h'), 2), List('e', 'f', 'g', 'h'), 4), List('b', 'c', 'd', 'e', 'f', 'g', 'h'), 9), List('a','b', 'c', 'd', 'e', 'f', 'g', 'h'), 17)
                                                  //> tree2  : patmat.Huffman.Fork = Fork(Leaf(a,8),Fork(Fork(Leaf(b,3),Fork(Leaf
                                                  //| (c,1),Leaf(d,1),List(c, d),2),List(b, c, d),5),Fork(Fork(Leaf(e,1),Leaf(f,1
                                                  //| ),List(e, f),2),Fork(Leaf(g,1),Leaf(h,1),List(g, h),2),List(e, f, g, h),4),
                                                  //| List(b, c, d, e, f, g, h),9),List(a, b, c, d, e, f, g, h),17)
  
  val msg: List[Bit] = List(1, 0, 0, 0, 1, 0, 1, 0)
                                                  //> msg  : List[patmat.huffmanWorksheet.Bit] = List(1, 0, 0, 0, 1, 0, 1, 0)
  
  val decoded: List[Char] = decode(tree2, msg)    //> decoded  : List[Char] = List(b, a, c)
  
  println(decodedSecret)                          //> List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
 
  val text: List[Char] = string2Chars("bac")      //> text  : List[Char] = List(b, a, c)
 	val encoded: List[Bit] = encode(tree2)(text)
                                                  //> encoded  : List[patmat.huffmanWorksheet.Bit] = List(1, 0, 0, 0, 1, 0, 1, 0)
                                                  //| 
  
  val table = convert(tree2)                      //> table  : patmat.Huffman.CodeTable = List((a,List(0)), (b,List(1, 0, 0)), (c
                                                  //| ,List(1, 0, 1, 0)), (d,List(1, 0, 1, 1)), (e,List(1, 1, 0, 0)), (f,List(1, 
                                                  //| 1, 0, 1)), (g,List(1, 1, 1, 0)), (h,List(1, 1, 1, 1)))
  
  val encoded2: List[Bit] = quickEncode(tree2)(text)
                                                  //> encoded2  : List[patmat.huffmanWorksheet.Bit] = List(1, 0, 0, 0, 1, 0, 1, 0
                                                  //| )
}