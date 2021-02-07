package com.kensai.poc.app

import cats.implicits._

object App {
  import cats.syntax.semigroup._

  def main(args: Array[String]): Unit = {
    println(s"The main method has been called \\o/")
  }

  def sayHello: String =
    s"Hello"

  def combine(left: Map[String, Set[String]],
              right: Map[String, Set[String]]): Map[String, Set[String]] =
    left |+| right
}
