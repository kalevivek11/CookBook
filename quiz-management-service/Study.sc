object Study {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //************Strings*****************************************************************************************************************
  
  //Prob: Testing equality of Strings
  
  val s1 = "vivek"                                //> s1  : String = vivek
  val s2 = "vivek"                                //> s2  : String = vivek
  
  s1==s2                                          //> res0: Boolean = true
  
  if (s1==s2)
  {
  	println("strings aress equal");
  }                                               //> strings aress equal
 
 //Prob: creating multiple line Strings
 
 val s3 = """this isdfdfsds strings
 which is on
 three line"""                                    //> s3  : String = this isdfdfsds strings
                                                  //|  which is on
                                                  //|  three line
 
 //Prob: Spliting strings
 
 val s4 = "hello,world"                           //> s4  : String = hello,world
 val s5 =  s4.split(",")                          //> s5  : Array[String] = Array(hello, world)
 for( s <- s5)
 println(s)                                       //> hello
                                                  //| world
 //Prob : Variable sudstitution
 
 val weight = 87                                  //> weight  : Int = 87
 println(s"weight of vivek is $weight")           //> weight of vivek is 87
 
 
 //Prob: Processing one charector at a time
 
	val s ="hello vivek".map(c=>c.toUpper)    //> s  : String = HELLO VIVEK
 
  val s11 ="hello vivek".map(_.toUpper)           //> s11  : String = HELLO VIVEK
 
 for (c <- s11)
 yield c.toLower                                  //> res1: String = hello vivek
 
 //Prob: detertime string contains regualr expression
 
	val numPattern= "[0-9]".r                 //> numPattern  : scala.util.matching.Regex = [0-9]
	val numPattern1= "[0-9]+".r               //> numPattern1  : scala.util.matching.Regex = [0-9]+
	val letterpattern="[a-z]+".r              //> letterpattern  : scala.util.matching.Regex = [a-z]+
	val address = "flat no 123  nymihs homes" //> address  : String = flat no 123  nymihs homes
	val x = numPattern.findAllIn(address)     //> x  : scala.util.matching.Regex.MatchIterator = non-empty iterator
	val x1 = letterpattern.findAllIn(address).foreach(println)
                                                  //> flat
                                                  //| no
                                                  //| nymihs
                                                  //| homes
                                                  //| x1  : Unit = ()
                                                  
	//Prob: searching reular expressions and replacing them
	
	val radd = address.replaceAll("[0-9]","x")//> radd  : String = flat no xxx  nymihs homes
	 
	val eadd1 = numPattern.replaceAllIn(address,"x")
                                                  //> eadd1  : String = flat no xxx  nymihs homes
  val eadd2 = numPattern1.replaceAllIn(address,"x")
                                                  //> eadd2  : String = flat no x  nymihs homes
 
 
 
 // Prob: extract one or more parts of a string that match the regular-expression patterns you specify
 val pattern = "([0-9]+) ([A-Za-z]+)".r           //> pattern  : scala.util.matching.Regex = ([0-9]+) ([A-Za-z]+)
 
 val pattern(count, fruit) = "100 Apple"          //> count  : String = 100
                                                  //| fruit  : String = Apple
 
  val ok="ok";                                    //> ok  : String = ok
  
  
 //*********************************************************NUMBERS********************************************************************
 
 // Prob: Converting string to numeric
 
 val 	i = "100".toInt                           //> i  : Int = 100
 
 val j = "v".toInt                                //> java.lang.NumberFormatException: For input string: "v"
                                                  //| 	at java.lang.NumberFormatException.forInputString(NumberFormatException.
                                                  //| java:65)
                                                  //| 	at java.lang.Integer.parseInt(Integer.java:580)
                                                  //| 	at java.lang.Integer.parseInt(Integer.java:615)
                                                  //| 	at scala.collection.immutable.StringLike$class.toInt(StringLike.scala:27
                                                  //| 2)
                                                  //| 	at scala.collection.immutable.StringOps.toInt(StringOps.scala:29)
                                                  //| 	at Study$$anonfun$main$1.apply$mcV$sp(Study.scala:77)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Study$.main(Study.scala:1)
                                                  //| 	at Study.main(Study.scala)
 
 val b = "1".toBoolean
 
 
 val x10 = (1 to 10).toList.foreach { x => x*2 }
 
 //*********************************************************Control Structures********************************************************************
 
}