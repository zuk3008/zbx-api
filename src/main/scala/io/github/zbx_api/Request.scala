package io.github.zbx_api

class Request(val id: Int, val method: String, val params: Map[String, AnyVal]) {

  override def toString: String = "Request(id=$id, method=$method, params=$params)"


}

object Request {

}
