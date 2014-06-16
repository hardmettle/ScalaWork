package test.worksheet

object test {
 
  val wordList = List("scala", "akka", "play framework", "sbt", "typesafe")
                                                  //> wordList  : List[String] = List(scala, akka, play framework, sbt, typesafe)
                                                  //| 
val tweet = "This is an example tweet talking about scala and sbt."
                                                  //> tweet  : String = This is an example tweet talking about scala and sbt.
tweet.contains("akka")                            //> res0: Boolean = false
(wordList.foldLeft(false)( _ || tweet.contains(_) ))
                                                  //> res1: Boolean = true
   wordList.foldLeft("harsh ")((b,a)=>b+a)        //> res2: String = harsh scalaakkaplay frameworksbttypesafe
         wordList                                 //> res3: List[String] = List(scala, akka, play framework, sbt, typesafe)
wordList.exists(tweet.contains)                   //> res4: Boolean = true
//val results = XML.load("http://search.twitter.com/search.atom?&q=scala")
}