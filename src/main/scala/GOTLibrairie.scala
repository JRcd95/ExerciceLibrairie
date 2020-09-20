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

  def calculePrixPanier(tomes: List[Int]): Double = {
    if (tomes(0) <= 1 && tomes(1) <= 1 && tomes(2) <= 1 && tomes(3) <= 1 && tomes(4) <= 1)  {
      val nbTotalTome = tomes(0) + tomes (1) + tomes (2) + tomes (3) + tomes (4)
      calculePrixPack(nbTotalTome)
    } else {
      -1.0
    }
  }






}
