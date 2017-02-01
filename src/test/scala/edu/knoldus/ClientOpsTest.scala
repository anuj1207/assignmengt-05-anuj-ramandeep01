package edu.knoldus

import org.scalatest.FlatSpec

/**
  * Created by anuj and raman on 1/2/17.
  */
class ClientOpsTest extends FlatSpec{

  val clientOps = new ClientOps

  it should "return true in adding Client" in {
    assert(clientOps.add(Client(1,3,"Raam","Tilak Nagar")))
  }

  it should "return true in updating a Client" in {
    assert(clientOps.update(101,4,"Raamu","Subhash Nagar"))
  }

  it should "return true in fetching Client" in {
    assert(clientOps.fetch(101))
  }

  it should "return true in deleting client" in {
    assert(clientOps.delete(101))
  }

}
