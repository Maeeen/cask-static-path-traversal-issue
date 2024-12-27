val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "test",
    version := "0.1.0-SNAPSHOT",
    run / fork := true,

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    libraryDependencies += "com.lihaoyi" %% "cask" % "0.9.4"
  )
