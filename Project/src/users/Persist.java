package users;

import java.io.*;  
public class Persist{  
 public static void main(String args[])throws Exception{  
  User s1 =new User("ap97@aut.ac.ir", "1234");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);
  out.flush();
  System.out.println("success");
 }  
} 