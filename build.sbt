name := """firsttry"""

version := "1.0-SNAPSHOT"

// Chaoqun: changed here
lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies += javaCore
libraryDependencies += evolutions

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
