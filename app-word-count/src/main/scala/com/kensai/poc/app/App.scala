package com.kensai.poc.app

import org.slf4j.LoggerFactory
import scala.io.Source

object App {

  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Missing parameter: need inputFilePath")
      System.exit(0)
    }

    val filename = args(0)
    logger.info(s"Count words on [$filename]")
    val lines = getLines(filename)
    val result = countWords(lines)
    println(s"Result is:\n$result")
  }

  private def getLines(fileName: String): Seq[String] = {
    val bufferedSource = Source.fromFile(fileName)
    val result = bufferedSource.getLines().toSeq
    bufferedSource.close()
    result
  }

  def countWords(lines: Seq[String]): Seq[(String, Int)] =
    lines
      .flatMap(_.split("\\W+"))
      .foldLeft(Map.empty[String, Int]) { (count, word) =>
        count + (word -> (count.getOrElse(word, 0) + 1))
      }
      .toSeq
      .sortBy(-_._2)

}
