object GOTLibrairie {

  def calculePanier(nbTomeI: Int, nbTomeII: Int, nbTomeIII: Int, nbTomeIV: Int, nbTomeV: Int): Int = {
    val nbTotalTome = nbTomeI + nbTomeII + nbTomeIII + nbTomeIV + nbTomeV
    val prixTotal = nbTotalTome*8
    prixTotal
  }
  def calculePack(): Int ={
    val nbTome = List(1,1,2,0,0)
    val nbPack = nbTome.max
    nbPack
  }

}
