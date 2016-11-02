import sbt._

// format: off

object Version {
  final val Scala     = "2.11.8"
  final val ScalaTest = "3.0.0"
}

object Library {
  val akkaSlf4j       = "com.typesafe.akka" %% "akka-slf4j"             % "2.4.8"
  val logbackClassic  = "ch.qos.logback"    %  "logback-classic"        % "1.1.2"
  val telegram4s      = "com.github.mukel"  %% "telegrambot4s"          % "v1.2.2"

  val scalaTest       = "org.scalatest"     %% "scalatest"              % Version.ScalaTest
}

object Dependencies {
  import Library._
  val communityBoard = Vector(akkaSlf4j, logbackClassic, telegram4s)
}
