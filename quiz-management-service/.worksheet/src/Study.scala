object Study {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(203); 
  
  //************Strings*****************************************************************************************************************
  
  //Prob: Testing equality of Strings
  
  val s1 = "vivek";System.out.println("""s1  : String = """ + $show(s1 ));$skip(19); 
  val s2 = "vivek";System.out.println("""s2  : String = """ + $show(s2 ));$skip(12); val res$0 = 
  
  s1==s2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(60); 
  
  if (s1==s2)
  {
  	println("strings aress equal");
  };$skip(108); 
 
 //Prob: creating multiple line Strings
 
 val s3 = """this isdfdfsds strings
 which is on
 three line""";System.out.println("""s3  : String = """ + $show(s3 ));$skip(54); 
 
 //Prob: Spliting strings
 
 val s4 = "hello,world";System.out.println("""s4  : String = """ + $show(s4 ));$skip(25); 
 val s5 =  s4.split(",");System.out.println("""s5  : Array[String] = """ + $show(s5 ));$skip(27); 
 for( s <- s5)
 println(s);$skip(51); 
 //Prob : Variable sudstitution
 
 val weight = 87;System.out.println("""weight  : Int = """ + $show(weight ));$skip(40); 
 println(s"weight of vivek is $weight");$skip(90); 
 
 
 //Prob: Processing one charector at a time
 
	val s ="hello vivek".map(c=>c.toUpper);System.out.println("""s  : String = """ + $show(s ));$skip(42); 
 
  val s11 ="hello vivek".map(_.toUpper);System.out.println("""s11  : String = """ + $show(s11 ));$skip(35); val res$1 = 
 
 for (c <- s11)
 yield c.toLower;System.out.println("""res1: String = """ + $show(res$1));$skip(85); 
 
 //Prob: detertime string contains regualr expression
 
	val numPattern= "[0-9]".r;System.out.println("""numPattern  : scala.util.matching.Regex = """ + $show(numPattern ));$skip(29); 
	val numPattern1= "[0-9]+".r;System.out.println("""numPattern1  : scala.util.matching.Regex = """ + $show(numPattern1 ));$skip(30); 
	val letterpattern="[a-z]+".r;System.out.println("""letterpattern  : scala.util.matching.Regex = """ + $show(letterpattern ));$skip(43); 
	val address = "flat no 123  nymihs homes";System.out.println("""address  : String = """ + $show(address ));$skip(39); 
	val x = numPattern.findAllIn(address);System.out.println("""x  : scala.util.matching.Regex.MatchIterator = """ + $show(x ));$skip(60); 
	val x1 = letterpattern.findAllIn(address).foreach(println);System.out.println("""x1  : Unit = """ + $show(x1 ));$skip(155); 
                                                  
	//Prob: searching reular expressions and replacing them
	
	val radd = address.replaceAll("[0-9]","x");System.out.println("""radd  : String = """ + $show(radd ));$skip(53); 
	 
	val eadd1 = numPattern.replaceAllIn(address,"x");System.out.println("""eadd1  : String = """ + $show(eadd1 ));$skip(52); 
  val eadd2 = numPattern1.replaceAllIn(address,"x");System.out.println("""eadd2  : String = """ + $show(eadd2 ));$skip(149); 
 
 
 
 // Prob: extract one or more parts of a string that match the regular-expression patterns you specify
 val pattern = "([0-9]+) ([A-Za-z]+)".r;System.out.println("""pattern  : scala.util.matching.Regex = """ + $show(pattern ));$skip(43); 
 
 val pattern(count, fruit) = "100 Apple";System.out.println("""count  : String = """ + $show(count ));System.out.println("""fruit  : String = """ + $show(fruit ));$skip(17); 
 
  val ok="ok";System.out.println("""ok  : String = """ + $show(ok ));$skip(207); ;
  
  
 //*********************************************************NUMBERS********************************************************************
 
 // Prob: Converting string to numeric
 
 val 	i = "100".toInt;System.out.println("""i  : Int = """ + $show(i ));$skip(103); 
 
// val j = "v".toInt
 
// val b = "1".toBoolean
 
 
 val x10 = (1 to 10).toList.foreach { x => x*2 };System.out.println("""x10  : Unit = """ + $show(x10 ));$skip(233); 
 
 //*********************************************************Control Structures********************************************************************
 
//val p = if(1) 2 else 3
 
 
 val names = Map("d"->"daru",
 									"p"->"pile");System.out.println("""names  : scala.collection.immutable.Map[String,String] = """ + $show(names ));$skip(44); 
 		for ((k,v)<- names)
 		println(s"$k,$v");$skip(108); 
                                                  
     //Prob : for and foreach
     val num = List(1,2,3);System.out.println("""num  : List[Int] = """ + $show(num ));$skip(42); 
     
     for (i <- num)
     println(i);$skip(38); 
 
 			num.foreach { x => println(x) };$skip(161); 
                                                  
      //Prob : filtering some elements in a loop
      
      for (i <- 1 to 10 if i % 2==0)
      println(i)
                                                  
 //*********************************************************Classes AND Properties********************************************************************

//Prob: Creating primary customer for class
	
	class Person (var fName:String,var lName:String)//constructure parameters
	{
		
		val home = "akola"
		
		def printHome {
		println(s"home in $home")
		}
		
		
		//printHome    // try uncommenting this
	};$skip(494); 


val p  = new Person("vivek","Kale");System.out.println("""p  : Study.Person = """ + $show(p ));$skip(13); 

p.printHome;$skip(51); val res$2 = 


//Prob: control the visibility of fields
p.fName

//p.fName="s"

case class vPerson(vName:String);System.out.println("""res2: String = """ + $show(res$2));$skip(77); 

val v = new vPerson("vk");System.out.println("""v  : Study.vPerson = """ + $show(v ));$skip(104); val res$3 = ;

v.vName // in case class consture variable is directly accesed by object not need to declare it as var;System.out.println("""res3: String = """ + $show(res$3))}


//Prob: Defining auxilary constructure

class pizza (var ptype:String, var psize:String)
{
	
	///def this(ptype1:Int){
	//}
	
}


//Prob: extend a base class

class eperson(var name : String, var address: Address)
{

}

case class Address(city:String,state:String)

}
