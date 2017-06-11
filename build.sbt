import AssemblyKeys._

name := "Lunatech"
 
version := "0.1"
 
scalaVersion := "2.11.8"
 
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "Maven Central" at "http://repo1.maven.org/maven2/"

libraryDependencies ++= {
  Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.2" % "test",
  "junit" % "junit" % "4.11"
  )
}

assemblySettings