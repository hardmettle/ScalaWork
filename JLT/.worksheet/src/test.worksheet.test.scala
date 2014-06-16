package test.worksheet

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 
 
  val wordList = List("scala", "akka", "play framework", "sbt", "typesafe");System.out.println("""wordList  : List[String] = """ + $show(wordList ));$skip(68); 
val tweet = "This is an example tweet talking about scala and sbt.";System.out.println("""tweet  : String = """ + $show(tweet ));$skip(23); val res$0 = 
tweet.contains("akka");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(53); val res$1 = 
(wordList.foldLeft(false)( _ || tweet.contains(_) ));System.out.println("""res1: Boolean = """ + $show(res$1));$skip(43); val res$2 = 
   wordList.foldLeft("harsh ")((b,a)=>b+a);System.out.println("""res2: String = """ + $show(res$2));$skip(18); val res$3 = 
         wordList;System.out.println("""res3: List[String] = """ + $show(res$3));$skip(32); val res$4 = 
wordList.exists(tweet.contains);System.out.println("""res4: Boolean = """ + $show(res$4))}
//val results = XML.load("http://search.twitter.com/search.atom?&q=scala")
}
