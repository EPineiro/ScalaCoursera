package forcomp


object AnagramsSheet {
  
  import forcomp.Anagrams._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 
  
  val o = wordOccurrences("Emanuel");System.out.println("""o  : forcomp.Anagrams.Occurrences = """ + $show(o ))}
}
