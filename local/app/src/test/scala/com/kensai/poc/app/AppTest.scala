package com.kensai.poc.app

import org.junit.runner.RunWith
import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AppTest extends AnyFlatSpec with GivenWhenThen {

  "sayHello" should "return [Hello] string" in {
    Given("Nothing special")

    When("sayHello()")
    val result = App.sayHello

    Then("Result is Hello")
    result shouldBe "Hello"
  }

  "combine" should "return combined versions of inputs" in {
    Given("Left and right values")
    val left: Map[String, Set[String]] = Map("toto" -> Set("Red", "Blue"))
    val right: Map[String, Set[String]] = Map(
      "toto" -> Set("Red", "Yellow"),
      "titi" -> Set("Yellow")
    )

    When("combine(left, right)")
    val result = App.combine(left, right)

    Then("Result is combined")
    val expected = Map(
      "toto" -> Set("Red", "Blue", "Yellow"),
      "titi" -> Set("Yellow")
    )
    result shouldBe expected
  }

}
