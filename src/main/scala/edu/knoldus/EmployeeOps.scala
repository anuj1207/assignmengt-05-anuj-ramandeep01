package edu.knoldus

import java.sql.Statement

/**
  * Created by anuj and raman on 1/2/17.
  */
case class Employee(id:Int, name:String, address:String, phone:Long, deptId:Int, projectId:Int)

class EmployeeOps {

  def add(employee: Employee):Boolean = {
    try {
      DBConnection.getConnection() match {
        case Some(x) => {
          val connection = x
          val statement: Statement = connection.createStatement()
          val output = statement.executeUpdate(s"insert into Employee values" +
            s"(${employee.id},'${employee.name}','${employee.address}',${employee.phone},${employee.deptId},${employee.projectId})")
          DBConnection.closeConnection()
          output
        }
        case _ =>false
      }
      true
    }
    catch{
      case ex: Exception => false
    }
  }

  def update(empId:Int, name:String, address:String, phone:Long, deptId:Int, projectId:Int):Boolean = {
    try {
      DBConnection.getConnection() match {
        case Some(x) => {
          val connection = x
          val statement: Statement = connection.createStatement()
          val output = statement.executeUpdate(s"update Employee set name = '$name',address = '$address'," +
            s"(phone = $phone,dept_id = $deptId,proj_id = $projectId) where id = $empId")
          DBConnection.closeConnection()
          output
        }
        case _ =>false
      }
      true
    }
    catch{
      case ex: Exception => false
    }
  }

  def fetch(empId:Int):Boolean = {
    try {
      DBConnection.getConnection() match {
        case Some(x) => {
          val connection = x
          val statement: Statement = connection.createStatement()
          val output = statement.executeUpdate(s"select * from Employee where id = $empId")
          DBConnection.closeConnection()
          output
        }
        case _ =>false
      }
      true
    }
    catch{
      case ex: Exception => false
    }
  }

  def delete(empID: Int): Boolean ={
    try {
      DBConnection.getConnection() match {
        case Some(x) => {
          val connection = x
          val statement: Statement = connection.createStatement()
          val output = statement.executeUpdate(s"Delete from Employee where id = $empID")
          DBConnection.closeConnection()
          output
        }
        case _ =>false
      }
      true
    }
    catch{
      case ex: Exception => false
    }
  }

}
