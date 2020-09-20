import org.scalatest.FunSuite
import org.scalatest.Matchers.{be, convertToAnyShouldWrapper}

class GOTLibrairieTest extends FunSuite{

  test("Panier vide") {
    GOTLibrairie.calculePrixPanier(0,0,0,0,0) should be (0.0)
  }
  test("Panier avec un seul tome") {
    GOTLibrairie.calculePrixPanier(1,0,0,0,0) should be (8.0)
  }
  test("Panier avec deux tomes différents") {
    GOTLibrairie.calculePrixPanier(1,1,0,0,0) should be (15.2)
  }
  test("Panier avec trois tomes différents") {
    GOTLibrairie.calculePrixPanier(1,1,1,0,0) should be (21.6)
  }
  test("Panier avec quatre tomes différents") {
    GOTLibrairie.calculePrixPanier(1,1,1,1,0) should be (25.6)
  }
  test("Panier avec cinq tomes différents") {
    GOTLibrairie.calculePrixPanier(1,1,1,1,1) should be (30.0)
  }
  test("Panier deux packs de un tome") {
    GOTLibrairie.calculePrixPanier(2,0,0,0,0) should be (16.0)
  }
  test("Panier deux packs de deux tomes") {
    GOTLibrairie.calculePrixPanier(2,2,0,0,0) should be (30.2)
  }
  test("Panier deux packs de quatres tomes") {
    GOTLibrairie.calculePrixPanier(2,2,2,1,1) should be (51.2)
  }

}
