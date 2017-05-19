object Study {
  println("Welcome to the Scala worksheet")
  
  //************Strings*****************************************************************************************************************
  
  //Prob: Testing equality of Strings
  
  val s1 = "vivek"
  val s2 = "vivek"
  
  s1==s2
  
  if (s1==s2)
  {
  	println("strings aress equal");
  }
 
 //Prob: creating multiple line Strings
 
 val s3 = """this isdfdfsds strings
 which is on
 three line"""
 
 //Prob: Spliting strings
 
 val s4 = "hello,world"
 val s5 =  s4.split(",")
 for( s <- s5)
 println(s)
 //Prob : Variable sudstitution
 
 val weight = 87
 println(s"weight of vivek is $weight")
 
 
 //Prob: Processing one charector at a time
 
	val s ="hello vivek".map(c=>c.toUpper)
 
  val s11 ="hello vivek".map(_.toUpper)
 
 for (c <- s11)
 yield c.toLower
 
 //Prob: detertime string contains regualr expression
 
	val numPattern= "[0-9]".r
	val numPattern1= "[0-9]+".r
	val letterpattern="[a-z]+".r
	val address = "flat no 123  nymihs homes"
	val x = numPattern.findAllIn(address)
	val x1 = letterpattern.findAllIn(address).foreach(println)
                                                  
	//Prob: searching reular expressions and replacing them
	
	val radd = address.replaceAll("[0-9]","x")
	 
	val eadd1 = numPattern.replaceAllIn(address,"x")
  val eadd2 = numPattern1.replaceAllIn(address,"x")
 
 
 
 // Prob: extract one or more parts of a string that match the regular-expression patterns you specify
 val pattern = "([0-9]+) ([A-Za-z]+)".r
 
 val pattern(count, fruit) = "100 Apple"
 
  val ok="ok";
  
  
 //*********************************************************NUMBERS********************************************************************
 
 // Prob: Converting string to numeric
 
 val 	i = "100".toInt
 
// val j = "v".toInt
 
// val b = "1".toBoolean
 
 
 val x10 = (1 to 10).toList.foreach { x => x*2 }
 
 //*********************************************************Control Structures********************************************************************
 
//val p = if(1) 2 else 3
 
 
 val names = Map("d"->"daru",
 									"p"->"pile")
 		for ((k,v)<- names)
 		println(s"$k,$v")
                                                  
     //Prob : for and foreach
     val num = List(1,2,3)
     
     for (i <- num)
     println(i)
 
 			num.foreach { x => println(x) }
                                                  
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
	}


val p  = new Person("vivek","Kale")

p.printHome


//Prob: control the visibility of fields
p.fName

//p.fName="s"

case class vPerson(vName:String)

val v = new vPerson("vk");

v.vName // in case class consture variable is directly accesed by object not need to declare it as var


//Prob: Defining auxilary constructure

class pizza (var ptype:String, var psize:String)
{
	
	///def this(ptype1:Int){
	//}
	
}


//Prob: extend a base class

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



//***************************************************************OBJECTS***********************************************************************

//Prob: cast an instance of a class from one type to another

//val reg = cm.lookup("red").asInstanceOf(Recognizer) the object returned by the lookup method is cast to an instance of a class named Recognizer



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

































}