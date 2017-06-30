import scala.util.Either

object Study {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
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
	};$skip(493); 


val p  = new Person("vivek","Kale")

//p.printHome


//Prob: control the visibility of fields
//p.fName

//p.fName="s"

case class vPerson(vName:String);System.out.println("""p  : Study.Person = """ + $show(p ));$skip(141); 

val v = vPerson("vk");

//v.vName // in case class consture variable is directly accesed by object not need to declare it as var


//Prob: Defining auxilary constructure

/*
class pizza (var ptype:String, var psize:String)
{
	
	///def this(ptype1:Int){
	//}
	
}
*/

//Prob: extend a base class
/*
class eperson(var name : String, var address: Address)
{
		val home = "akola"
			
		def printHome {
		println(s"home in $home")
		}
}

case class Address(city:String,state:String)


class Employee (name:String,address:Address,val age : Int ) extends eperson(name,address)

val em = new Employee("vssd",Address("indi","asa"),10)

*/

//***************************************************************OBJECTS***********************************************************************

//Prob: cast an instance of a class from one type to another

//val reg = cm.lookup("red").asInstanceOf(Recognizer) the object returned by the lookup method is cast to an instance of a class named Recognizer

/*

val e= 10

val e2 = e.asInstanceOf[Long]


def printAll(num:Int*)
{
	println("class"+num.getClass)
}


//Prob : to create a Singleton object to ensure that only one instance of a class exists
object CashRegister {

def open { println("opened") }

def close { println("closed") }
}
//With CashRegister defined as an object, there can be only one instance of it, and its
//methods are called just like static methods on a Java class:

object Main extends App {

CashRegister.open
CashRegister.close

}
*/
//************************************************************Trait******************************************************************

//Prob : How to have interface in scala

//You can use a trait just like a Java interface

trait BaseSoundPlayer {
def play
def close
def pause
def stop    // only method names are required when it does not have any name
def resume(enabled : Boolean)
}

//class mySystem extends BaseSoundPlayer{

// class my sound player must implement all the mothods

//}


abstract class MyNewSystem extends BaseSoundPlayer{
// this class as it is abstact have a luxary to implement only few methods of trait
}


//Prob : Using trait like a abstact class in JAVA

trait Pet {
def speak { println("Yo") } // concrete implementation
def comeToMaster // abstract method
}

class Dog extends Pet {
// don't need to implement 'speak' if you don't need to
def comeToMaster { ("I'm coming!") }
}
class Cat extends Pet {
// override the speak method
override def speak { ("meow") }
def comeToMaster { ("That's not gonna happen.") }
}

abstract class FlyingPet extends Pet {
def fly { ("I'm flying!") }  // if make a method abstract then no need of implementing anything from trait
};System.out.println("""v  : Study.vPerson = """ + $show(v ));$skip(2892); 




//****************************************************************************************************************************************


//Prob: How to convert array to string

val obj = Array("hi","am","vivek","kale");System.out.println("""obj  : Array[String] = """ + $show(obj ));$skip(30); 

val obj2 = obj.mkString(" ");System.out.println("""obj2  : String = """ + $show(obj2 ));$skip(31); 
val obj3 = obj.mkString("\n ")



//Prob : Creating an array which can grow in size
import scala.collection.mutable.ArrayBuffer;System.out.println("""obj3  : String = """ + $show(obj3 ));$skip(132); 
val fruits = ArrayBuffer[String]();System.out.println("""fruits  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(fruits ));$skip(20); val res$2 = 

fruits += "banana";System.out.println("""res2: Study.fruits.type = """ + $show(res$2));$skip(18); val res$3 = 
fruits += "apple";System.out.println("""res3: Study.fruits.type = """ + $show(res$3));$skip(24); 

println(fruits.length);$skip(225); 





//*****************************************************(LIST ARRAY MAP SET)*********************************************************************

// list and map are mutable by nature

 val wx = List(1, 2.0, 33D, 4000L)
 
 // to use mutable list use listBuffer
 
 import scala.collection.mutable.ListBuffer;System.out.println("""wx  : List[Double] = """ + $show(wx ));$skip(125); 
 
 val fruitsm = ListBuffer[String]();System.out.println("""fruitsm  : scala.collection.mutable.ListBuffer[String] = """ + $show(fruitsm ));$skip(21); val res$4 = 
 
 fruitsm+= "mango";System.out.println("""res4: Study.fruitsm.type = """ + $show(res$4));$skip(19); val res$5 = 
 fruitsm+= "guava";System.out.println("""res5: Study.fruitsm.type = """ + $show(res$5));$skip(55); val res$6 = 

// adding multiple elements

fruitsm += ("a","b","c");System.out.println("""res6: Study.fruitsm.type = """ + $show(res$6));$skip(111); 

	
// immutable map...different ways of implementations

val states = Map("AL" -> "Alabama", "AK" -> "Alaska");System.out.println("""states  : scala.collection.immutable.Map[String,String] = """ + $show(states ));$skip(58); 

val states2 = Map( ("AL", "Alabama"), ("AK", "Alaska") );System.out.println("""states2  : scala.collection.immutable.Map[String,String] = """ + $show(states2 ));$skip(73); 


// mutable map
var states1 = collection.mutable.Map("AL" -> "Alabama");System.out.println("""states1  : scala.collection.mutable.Map[String,String] = """ + $show(states1 ));$skip(35); val res$7 = 
states1 +=  ("AP"->"Andrapradesh");System.out.println("""res7: scala.collection.mutable.Map[String,String] = """ + $show(res$7));$skip(54); 

//accessing values from map

	val al = states1("AL");System.out.println("""al  : String = """ + $show(al ));$skip(30); 

	val al2 = states1.get("AL");System.out.println("""al2  : Option[String] = """ + $show(al2 ));$skip(74); 
	
	//if get is used as u are not sure of key
	val al3 = states1.get("YO");System.out.println("""al3  : Option[String] = """ + $show(al3 ));$skip(63); 

var x3 = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c");System.out.println("""x3  : scala.collection.mutable.Map[Int,String] = """ + $show(x3 ));$skip(49); 

val y  = x3.transform((k,v) => v.toUpperCase());System.out.println("""y  : scala.collection.mutable.Map[Int,String] = """ + $show(y ));$skip(12); 

println(y);$skip(32); 

val z = y.filter(x => x._1 >2);System.out.println("""z  : scala.collection.mutable.Map[Int,String] = """ + $show(z ));$skip(146); 

//val q = y.filter( _ > 2)


//converting list of tuple to map of key vlaue pair

val tlist = List(("a","akola"),("b","bombay"),("c","chennai"));System.out.println("""tlist  : List[(String, String)] = """ + $show(tlist ));$skip(48); 
var mapping = tlist.map(f => (f._1,f._2)).toMap;System.out.println("""mapping  : scala.collection.immutable.Map[String,String] = """ + $show(mapping ));$skip(18); 

println(mapping);$skip(233); 

//*********************************************************************Project related Learning**********************************************************************************

//Use of Either

val ln = Console.readLine("hello");System.out.println("""ln  : String = """ + $show(ln ));$skip(109); 

def result: Either[String,Int] =
	try
	{
		Right(ln.toInt)
	}
	catch
	{
		case e:Exception =>
		Left(ln)
	};System.out.println("""result: => scala.util.Either[String,Int]""");$skip(114); 

val c = result match {
case Right(result) => "you massed me INT "
case Left(result) => "you passed me STRING "
};System.out.println("""c  : String = """ + $show(c ))}




}
