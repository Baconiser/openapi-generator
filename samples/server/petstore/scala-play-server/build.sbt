organization := ""
version      := ""
name         := ""
scalaVersion := "2.13.13"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  ws,
  "org.webjars" % "swagger-ui" % "3.1.5",
  "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
  "org.scalatest"          %% "scalatest"          % "3.0.4" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)
