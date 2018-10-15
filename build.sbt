import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization := "com.pigumer",
    name := "config-sandbox",
    scalaVersion := "2.12.6"
  )
  .settings(
    libraryDependencies ++= Seq(
      cfg
    )
  )