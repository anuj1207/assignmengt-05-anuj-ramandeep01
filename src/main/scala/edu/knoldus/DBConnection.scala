package edu.knoldus

import java.sql.{Connection, DriverManager}

/**
  * Created by Anuj and Ramandeep on 1/31/2017.
  */
object DBConnection {

  def getConnection(): Option[Connection] = {
    try {
      val url = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6156619"
      val driver = "com.mysql.jdbc.Driver"
      Class.forName(driver).newInstance()
      val connection: Connection = DriverManager.getConnection(url, "sql6156619", "Ps38QG4I8l")
      Some(connection)
    }
    catch{
      case ex: Exception => print(s"Exception: $ex.getMessage()")
        None
    }
  }

  def closeConnection():Boolean = {
    try {
      getConnection() match {
        case Some(x) =>{
          x.close()
          true
        }
        case _ => true
      }
    }
    catch{
      case ex: Exception => print(s"Exception: $ex.getMessage()")
        false
    }
  }

}
