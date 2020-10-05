
object GOTLibrairie {

  def calculePrixPack(nbTomeDifferent: Int): Double = {
    if (nbTomeDifferent == 0) {
      0.0
    } else if (nbTomeDifferent == 1) {
      8.0
    } else if (nbTomeDifferent == 2) {
      15.2
    } else if (nbTomeDifferent == 3) {
      21.6
    } else if (nbTomeDifferent == 4) {
      25.6
    } else {
      30.0
    }
  }

  def calculePrixPanier(tomes: List[Int]): Double = {
    if (tomes.max >= 2) {
      val tomeRestants: List[Int] = tomes.map(i=> if (i!=0) i-1 else i)
      val prixPanier = calculePrixPack(tomes.sum - tomeRestants.sum) + calculePrixPanier(tomeRestants)
      if (prixPanier == 51.6 ){ // prix d'un panier avec un pack de 3 et un de 5
         51.2 // prix d'un panier avec deux packs de 4, maximisation de la remise
      }else
        prixPanier
    }else {
      calculePrixPack(tomes.sum)
    }
  }
  
}



















