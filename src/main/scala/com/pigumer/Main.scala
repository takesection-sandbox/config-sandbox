package com.pigumer

import com.typesafe.config.{Config, ConfigFactory}


object Main extends App {

  val config = ConfigFactory.load()
  val s = config.getString("db.default.url")
  println(s)
}
