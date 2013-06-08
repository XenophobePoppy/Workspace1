/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Poppy
 */

import java.util.List;

import javax.sql.rowset.CachedRowSet;
//import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

   
   
//get weight and tagname from database
public class TagCloud {
    
    static ResultSet rs = null;
    static Statement stmt =null;
    static Float weight;
    static String tagname;
    int font;
    static String sql;
    
    
public static void main(String[] args) throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/picture","root","18313471");
	//new ResultSet();
	

    
    
 //  public ResultSet executeQuery(String sql){
 //  try
  // {
       PreparedStatement statement= conn.prepareStatement("select weight,tagname from tags, userprofile where userprofile.tagid=tags.tagid");
       rs = statement.executeQuery();
       while(rs.next())
       {
         tagname= rs.getString("tagname");
         weight= rs.getFloat("weight");
         System.out.println(tagname+"  "+weight); 
         
       }
       }
}
       
  // }
   
  /* catch(Exception e)
   {
       System.err.println("aq.executeQuery:"+e.getMessage());
   }
   return rs;

   }
   
 public String getTagname(){
 return (this.tagname);
 }
       
 
//set font
   public void setfont(float weight) {
  
   if(weight <3)
       font=13;
   else if (weight<7)
       font=20;
   else if (weight<15)
       font=28;
   else
           font=36;
       }
   
   public int getFont(){
   return (this.font);
   }
*/ 




   

        

    
    



	


