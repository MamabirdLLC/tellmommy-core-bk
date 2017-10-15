//Unpublished Work (c) 2017 Mamabird, LLC
package biz.mamabird.tellmommy.services

import biz.mamabird.tellmommy.domain.Family
import org.scalatest.FunSuite
import org.scalatest.mock.MockitoSugar

class FamilyServiceTest extends FunSuite with MockitoSugar {

  val testCase = new FamilyService()

  test("Make the Finch Family!") {
    val result = testCase.createFamily("Finch")
    assert(result.name == "Finch")
  }

  test("Make a Tammy Parent!") {
    val family = mock[Family]
    val result = testCase.createParent("Tammy", family)
    assert(result.name == "Tammy")
    assert(result.family == family)
  }

  test("Make a Ben Child!") {
    val family = mock[Family]
    val nickname = "BennyBoy"
    val result = testCase.createChild("Ben", nickname, family)
    assert(result.name == "Ben")
    assert(result.family == family)
    assert(result.nickname == nickname)

  }

}
