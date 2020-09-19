object GOTLibrairie {

  def calculePrixPack(nbTomeDifferent: Int): Double = {
    if (nbTomeDifferent == 0) {
       0.0
    } else if (nbTomeDifferent == 1) {
       8.0
    } else if (nbTomeDifferent == 2) {
      15.20
    } else if (nbTomeDifferent == 3) {
      21.60
    }else if (nbTomeDifferent == 4) {
      25.60
    }else {
      30.0
    }
  }

  def calculePrixPanier(nbTomeI: Int, nbTomeII: Int, nbTomeIII: Int, nbTomeIV: Int, nbTomeV: Int): Double = {
    if (nbTomeI <= 1 && nbTomeII <=1 && nbTomeIII <=1 && nbTomeIV <=1 && nbTomeV <=1) {
      val nbTotalTome = nbTomeI + nbTomeII + nbTomeIII + nbTomeIV + nbTomeV
      calculePrixPack(nbTotalTome)
    } else {
      -1.0
    }
  }

}
