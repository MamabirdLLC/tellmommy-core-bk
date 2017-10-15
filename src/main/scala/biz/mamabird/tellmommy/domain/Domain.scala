//Unpublished Work (c) 2017 Mamabird, LLC
package biz.mamabird.tellmommy.domain

import org.joda.time.DateTime

case class Family(id: String, name: String)

case class Parent(id: String, name: String, family: Family)

case class Child(id: String, name: String, nickname: String, family: Family)

case class Chore(id: String, name: String, description: String, family: Family)

case class Assignment(id: String, value: Double, chore: Chore, child: Child)

case class Account(id: String, name: String, child: Child)

case class Achievement(timestamp: DateTime, assignment: Assignment)

case class DefaultRewardSplit(child: Child, account: Account, percentage: Double)

case class RewardSplit(assignment: Assignment, account: Account, percentage: Double)



