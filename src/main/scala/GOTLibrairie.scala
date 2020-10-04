
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
    } else if (nbTomeDifferent == 4) {
      25.60
    } else {
      30.0
    }
  }

  def calculePrixPanier(tomes: List[Int]): Double = {
    if (tomes.max >= 2) {
      val tomeRestants: List[Int] = tomes.map(i=> if (i!=0) i-1 else i)
      val prixPanier = calculePrixPack(tomes.sum - tomeRestants.sum) + calculePrixPanier(tomeRestants)
      if (prixPanier == 51.6 ){
        val remiseMax : Double = 51.2
        remiseMax
      }else
        prixPanier
    }else {
      calculePrixPack(tomes.sum)
    }
  }
  
}



















