import org.scalatest._
import flatspec._
import matchers._
import Main._

class ExampleSpec extends AnyFlatSpec with should.Matchers {

  it should "return new number according to special adding rules" in {

    myAdding(998) shouldBe 10109
    myAdding(1010) shouldBe 2121
    myAdding(92) shouldBe 103
  }
}