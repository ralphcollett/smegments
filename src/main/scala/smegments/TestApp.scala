package smegments

object TestApp extends App {

  val accessTokenString = args(0)

  val brockwellPark = BoundCoords(51.448782, -0.108672)

  val royalVictoriaDock = BoundCoords(51.508270, 0.018356)

  val segments = Segments.findMore(brockwellPark, royalVictoriaDock, accessTokenString)
  segments.fold(println, {
    _.segments.foreach(println)
  })
}
