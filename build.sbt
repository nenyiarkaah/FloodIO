enablePlugins(GatlingPlugin)
name := "flood"

version := "0.1"

scalaVersion := "2.12.3"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.0" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.3.0" % "test"



