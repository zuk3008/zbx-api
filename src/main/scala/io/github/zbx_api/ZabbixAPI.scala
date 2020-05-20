package io.github.zbx_api

import scala.util.parsing.json.JSON

trait ZabbixAPI {

  def init()

  def destroy()

  def login(user: String, password: String)

  def call(request: Request): JSON

}
