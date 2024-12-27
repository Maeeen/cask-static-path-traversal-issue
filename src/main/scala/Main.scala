import cask.endpoints.*

object MinimalApplication extends cask.MainRoutes:
  @cask.get("/")
  def hello() = "Hello World!"

  @cask.staticFiles("/static")
  def oops() = "static"

  initialize()