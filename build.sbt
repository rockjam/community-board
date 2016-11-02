lazy val `community-board` = project
  .in(file("."))
  .settings(libraryDependencies ++= Dependencies.communityBoard)
  .enablePlugins(AutomateHeaderPlugin, GitVersioning)

libraryDependencies ++= Vector(
  Library.scalaTest % "test"
)

initialCommands := """|import com.github.rockjam.community.board._
                      |""".stripMargin
