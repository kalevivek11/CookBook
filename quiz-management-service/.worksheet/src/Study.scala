object Study {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(155); 
  
  //************Strings*****************************************************************
  
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
 three line""";System.out.println("""s3  : String = """ + $show(s3 ))}
 
 //
 
}
