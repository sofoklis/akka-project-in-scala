import sbt._
import sbt.Keys._

object AkkaProjectInScalaBuild extends Build {

  lazy val akkaProjectInScala = Project(
    id = "akka-project-in-scala",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka Project In Scala",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.1.0"
    )
  )
}
