package example

import java.nio.file.Paths

class HelloSpec extends munit.FunSuite {
  test("say hello") {
    val resourceUri = getClass.getResource("/").toURI
    println(resourceUri)
    Paths.get(resourceUri)
  }
}
