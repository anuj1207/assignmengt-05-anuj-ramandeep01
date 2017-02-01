package edu.knoldus

import org.scalatest.FlatSpec

/**
  * Created by anuj and raman on 1/2/17.
  */
class ProjectOpsTest extends FlatSpec{

  val projectOps = new ProjectOps

  it should "return true in adding project" in {
    assert(projectOps.add(Project(1,5,"codeSquad",5)))
  }

  it should "return true in updating project" in {
    assert(projectOps.update(1,4,"code ranch",5))
  }

  it should "return true in fetching project" in {
    assert(projectOps.fetch(1))
  }

  it should "return true in deleting project" in {
    assert(projectOps.delete(1))
  }

}
