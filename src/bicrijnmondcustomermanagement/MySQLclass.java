package bicrijnmondcustomermanagement;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySQLclass extends Applet{
  public static Connection connect = null;
  protected static Statement statement = null;
  protected static PreparedStatement preparedStatement = null;
  protected static ResultSet resultSet = null;

    /**
     *
     * @return
     * @throws Exception
     */
    public void readDataBase() throws Exception {
      
    try {
      // This will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
     
      connect = DriverManager
               .getConnection("jdbc:mysql://127.0.0.1/test?"
                + "user=root&password=MSQLpass21!");
    		 // .getConnection("jdbc:mysql://82.197.130.55:3306/1522552_test?"
                //+ "user=1522552_test&password=MSQLpass21!");
      
      // Statements allow to issue SQL queries to the database
      statement = connect.createStatement();
      // Result set get the result of the SQL query
      resultSet = statement
          .executeQuery("select * from test.customers, tickets");
      writeResultSet(resultSet);
//Commented INSERT for future reference
      // PreparedStatements can use variables and are more efficient
     // preparedStatement = connect
      //    .prepareStatement("insert into  test.customers values (default, ?, ?, ?, ? , ?, ?, ?)");
      // "myuser, webpage, datum, summary, customers from test.customers");
      // Parameters start with 1
      //preparedStatement.setString(1, "Sjaakie Sjaakssen");
     // preparedStatement.setString(2, "Sjaakssen@yahoo.nl");
    //  preparedStatement.setString(3, "pannekoekenstraat 2");
    ///  preparedStatement.setString(4, "Rotterdam");
  //    preparedStatement.setString(5, "3022PK");
  //    preparedStatement.setString(6, "0101235489");
   //   preparedStatement.setString(7, "Yahoo");
  //    preparedStatement.executeUpdate();

      preparedStatement = connect
          .prepareStatement("SELECT * from test.customers");
      resultSet = preparedStatement.executeQuery();
      writeResultSet(resultSet);

      // Remove again the insert comment
      preparedStatement = connect
      .prepareStatement("delete from test.customers where NAAM= ? ; ");
      preparedStatement.setString(1, "Test");
      preparedStatement.executeUpdate();
      
      resultSet = statement
      .executeQuery("select * from test.customers");
      writeMetaData(resultSet);
      
            
    } catch (ClassNotFoundException | SQLException e) {
      throw e;
    } finally {
      close();
    }

  }

  protected static void writeMetaData(ResultSet resultSet) throws SQLException {
    //   Now get some metadata from the database
    // Result set get the result of the SQL query
    
    System.out.println("The columns in the table are: ");
    
    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
    }
  }

  protected static void writeResultSet(ResultSet resultSet) throws SQLException {
    // ResultSet is initially before the first data set
    while (resultSet.next()) {
  //way to show output in console  
        // It is possible to get the columns via name
      // also possible to get the columns via the column number
      // which starts at 1
      // e.g. resultSet.getSTring(2);
//      String Naam = resultSet.getString("naam");
//      String Email = resultSet.getString("email");
//      String Adres = resultSet.getString("adres");
//      String plaats = resultSet.getString("plaats");
//      String Postcode = resultSet.getString("postcode");
//      String Telefoon = resultSet.getString("telefoon");
//      String Bedrijfsnaam = resultSet.getString("bedrijfsnaam");
//      System.out.println("Naam: " + Naam);
//      System.out.println("Email: " + Email);
//      System.out.println("Adres: " + Adres);
//      System.out.println("plaats: " + plaats);
//      System.out.println("Postcode: " + Postcode);
//      System.out.println("Telefoon:" + Telefoon);
//      System.out.println("Bedrijfsnaam" + Bedrijfsnaam);
    
    }
  }
  // You need to close the resultSet
  public static void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

} 