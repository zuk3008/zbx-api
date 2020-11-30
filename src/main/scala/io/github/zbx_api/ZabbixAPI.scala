package io.github.zbx_api

import com.fasterxml.jackson.databind.JsonNode

trait ZabbixAPI {

  def init()

  def destroy()

  def login(user: String, password: String)

  def call(request: Request): JsonNode

}
