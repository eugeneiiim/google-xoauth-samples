name := "google-xoauth-samples"

organization := "emarinelli"

version := "0.0.0"

scalaVersion := "2.10.0-RC1"

resolvers += "oauth maven" at "http://oauth.googlecode.com/svn/code/maven"

libraryDependencies ++= List(
  "net.oauth.core" % "oauth" % "20090825",
  "com.google.code.javax.mail" % "google-imap-ext" % "0.5" from "https://s3-us-west-1.amazonaws.com/public.dev.blendlabs/java-gmail-imap-1.4.4-gm-ext-0.5.jar"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Blend Repository" at "https://blend.artifactoryonline.com/blend/blend")
