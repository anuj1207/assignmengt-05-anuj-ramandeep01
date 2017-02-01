package edu.knoldus

import org.scalatest.FlatSpec
import java.sql.{Connection, DriverManager}

/**
  * Created by ANUJ_SAXENA on 2/1/2017.
  */
class DBConnectionTest extends FlatSpec{

  val dbConnection = DBConnection

  it should "return true for getting connection object" in {
    assert(dbConnection.getConnection()match {
      case Some(_) => true
      case _ => false
    })
  }

  it should "return true for closing connection" in {
    assert(dbConnection.closeConnection())
  }

}
