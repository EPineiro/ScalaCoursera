package patmat

object huffmanWorksheet {

	import patmat.Huffman._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 
	
  println("Welcome to the Scala worksheet");$skip(49); 
  
  val l1 = List('a', 'b', 'a', 'b', 'b', 'c');System.out.println("""l1  : List[Char] = """ + $show(l1 ));$skip(39); 
  val l2 = string2Chars("Hello-World");System.out.println("""l2  : List[Char] = """ + $show(l2 ));$skip(27); 
  
  val freqs = times(l1);System.out.println("""freqs  : List[(Char, Int)] = """ + $show(freqs ));$skip(50); 
  
  val orderedList = makeOrderedLeafList(freqs);System.out.println("""orderedList  : List[patmat.Huffman.Leaf] = """ + $show(orderedList ));$skip(58); 
  
  val combined = combine(Huffman.combine(orderedList));System.out.println("""combined  : List[patmat.Huffman.CodeTree] = """ + $show(combined ));$skip(32); 
  val tree = createCodeTree(l1)
                                                  
 
  type Bit = Int;System.out.println("""tree  : patmat.Huffman.CodeTree = """ + $show(tree ));$skip(177); 
  
 
  val l3 = List('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'd', 'e', 'f', 'g', 'h');System.out.println("""l3  : List[Char] = """ + $show(l3 ));$skip(455); 
  //val tree2 = createCodeTree(l3)
                                                  
  val tree2 = Fork(Leaf('a',8), Fork(Fork(Leaf('b', 3), Fork(Leaf('c', 1), Leaf('d', 1), List('c', 'd'), 2), List('b', 'c', 'd'), 5), Fork(Fork(Leaf('e', 1), Leaf('f', 1), List('e', 'f'), 2), Fork(Leaf('g', 1), Leaf('h', 1), List('g', 'h'), 2), List('e', 'f', 'g', 'h'), 4), List('b', 'c', 'd', 'e', 'f', 'g', 'h'), 9), List('a','b', 'c', 'd', 'e', 'f', 'g', 'h'), 17);System.out.println("""tree2  : patmat.Huffman.Fork = """ + $show(tree2 ));$skip(56); 
  
  val msg: List[Bit] = List(1, 0, 0, 0, 1, 0, 1, 0);System.out.println("""msg  : List[patmat.huffmanWorksheet.Bit] = """ + $show(msg ));$skip(50); 
  
  val decoded: List[Char] = decode(tree2, msg);System.out.println("""decoded  : List[Char] = """ + $show(decoded ));$skip(28); 
  
  println(decodedSecret);$skip(47); 
 
  val text: List[Char] = string2Chars("bac");System.out.println("""text  : List[Char] = """ + $show(text ));$skip(47); 
 	val encoded: List[Bit] = encode(tree2)(text);System.out.println("""encoded  : List[patmat.huffmanWorksheet.Bit] = """ + $show(encoded ));$skip(32); 
  
  val table = convert(tree2);System.out.println("""table  : patmat.Huffman.CodeTable = """ + $show(table ));$skip(56); 
  
  val encoded2: List[Bit] = quickEncode(tree2)(text);System.out.println("""encoded2  : List[patmat.huffmanWorksheet.Bit] = """ + $show(encoded2 ))}
}
