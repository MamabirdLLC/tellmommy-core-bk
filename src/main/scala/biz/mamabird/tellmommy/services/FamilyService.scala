//Unpublished Work (c) 2017 Deere & Company
package biz.mamabird.tellmommy.services

import java.util.UUID

import biz.mamabird.tellmommy.domain.{Child, Family, Parent}

class FamilyService {

  def createFamily(name: String): Family = {
    Family(createId, name)
  }

  def createParent(name: String, family: Family): Parent = {
    Parent(createId, name, family)
  }

  def createChild(name: String, nickname: String, family: Family): Child = {
    Child(createId, name, nickname, family)
  }


  private def createId = UUID.randomUUID().toString
}
