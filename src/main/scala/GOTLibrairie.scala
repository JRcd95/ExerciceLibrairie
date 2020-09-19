object GOTLibrairie {

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

  def calculePanier(nbTomeI: Int, nbTomeII: Int, nbTomeIII: Int, nbTomeIV: Int, nbTomeV: Int): Unit = {
    if (nbTomeI <= 1 && nbTomeII <=1 && nbTomeIII <=1 && nbTomeIV <=1 && nbTomeV <=1) {
      val nbTotalTome = nbTomeI + nbTomeII + nbTomeIII + nbTomeIV + nbTomeV
      println(nbTotalTome)
    } else {
      println("error")
    }

  }
  




}
