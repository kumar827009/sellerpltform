import sbt._

object Dependencies {
  val bootstrapVersion = "(2.3.2,)"
  val bootstrap = "org.webjars" % "bootstrap" % bootstrapVersion

  val myDependencies = Seq(bootstrap)
}