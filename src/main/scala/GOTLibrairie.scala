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
      val tomeRestants: List[Int] = {
        for {
          i <- tomes
        } yield {
          if (i != 0) i - 1
          else i
        }
      }
      val pack = tomes.sum - tomeRestants.sum
      val pack2 = tomeRestants.sum
      val total = calculePrixPack(pack) + calculePrixPack(pack2)
      total
    }else {
      calculePrixPack(tomes.sum)
    }
  }
}







      /*tomes.dropWhile((n :Int) => {n==0})

      for (i <- tomes) yield i-1
      println(tomes)

      (tomes(0) != 0 && tomes(1) != 0 && tomes(2) != 0 && tomes(3) != 0 && tomes(4) != 0)


      -1.0*/











