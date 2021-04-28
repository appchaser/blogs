/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pi.test;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.pi.entity.Comments;
import edu.pi.entity.Forum;

import edu.pi.services.CommentCRUD;
import edu.pi.services.PiCRUD;
import java.sql.*;
import edu.pi.tools.MyConnection;
import javafx.scene.control.DatePicker;

/**
 *
 * @author pc
 */
public class MainClass {
    public static void main(String[] args) {
      //MyConnection mc= new MyConnection();
      //MailClass.send("marwen.maatallah@esprit.tn");
      try {
      Mailing.sendMail("Marouabenfguira26@gmail.com");
      } catch (Exception ex) {
                       
                    }
      PiCRUD f = new PiCRUD();
      CommentCRUD C = new CommentCRUD();
      Comments c1=new Comments(18,"author","content");
      //C.addComments(c1);
     // C.Supprimer(c1);
      Forum f1 = new Forum("feres","ben foulen","2222222222");
      Forum f2 = new Forum("esprit","yassinben@gmail.com","yyyyy");
     
    // f.delete(21);
    // f.addforum(f1);
   // f.addforum2(f1);
  // f.update(f2, 18);
      //  System.out.println("hello word 1111111111");
     // System.out.println( f.getForums());
    }
}
