object GOTLibrairie {

  def calculePanier(nbTomeI: Int, nbTomeII: Int, nbTomeIII: Int, nbTomeIV: Int, nbTomeV: Int): Int = {
    val nbTotalTome = nbTomeI + nbTomeII + nbTomeIII + nbTomeIV + nbTomeV
    val prixTotal = nbTotalTome * 8
    prixTotal
  }

  def calculePrixPanier(nb1: Int): Double = {
    if (nb1 == 0) {
      val prixPanier = 0.0
      prixPanier
    } else if (nb1 == 1) {
      val prixPanier = 8.0
      prixPanier
    } else if (nb1 == 2) {
      val prixPanier = 15.20
      prixPanier
    } else if (nb1 == 3) {
      val prixPanier = 21.60
      prixPanier
    }else if (nb1 == 4) {
      val prixPanier = 25.60
      prixPanier
    }else {
      val prixPanier = 30.0
      prixPanier
    }

  }


}
