object GOTLibrairie {

  def calculePanier(nbTomeI: Int, nbTomeII: Int, nbTomeIII: Int, nbTomeIV: Int, nbTomeV: Int): Int = {
    val nbTotalTome = nbTomeI + nbTomeII + nbTomeIII + nbTomeIV + nbTomeV
    val prixTotal = nbTotalTome*8
    prixTotal
  }
}
