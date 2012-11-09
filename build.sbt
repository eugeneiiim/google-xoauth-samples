name := "google-xoauth-samples"

organization := "com.google.code"

version := "0.0.1"

scalaVersion := "2.10.0-RC1"

resolvers ++= List(
  "oauth maven" at "http://oauth.googlecode.com/svn/code/maven",
  "Blend Repository" at "https://blend.artifactoryonline.com/blend/blend"
)

libraryDependencies ++= List(
  "net.oauth.core" % "oauth" % "20090825",
  "com.google.code" % "java-gmail-imap" % "1.4.4-gm-ext-0.5"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Blend Repository" at "https://blend.artifactoryonline.com/blend/blend")
