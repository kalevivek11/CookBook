object CookBook {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //************Strings*****************************************************************
  
  //Prob: Testing equality of Strings
  
  val s1 = "vivek"                                //> s1  : String = vivek
  val s2 = "vivek"                                //> s2  : String = vivek
  
  s1==s2                                          //> res0: Boolean = true
  
  if (s1==s2)
  {
  	println("strings aress equal");
  }                                               //> strings are equal
 
 //Prob: creating multiple line Strings
 
 val s3 = """this is strings
 which is on 
 three line""
 
 //
  
}