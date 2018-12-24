enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "typescript-2-scala-facade"
version := "0.1.0"
scalaVersion := "2.12.8"

scalaJSUseMainModuleInitializer := true
mainClass := Some("t2sf.main")

libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"
npmDependencies in Compile += "typescript" -> "3.2.2"
