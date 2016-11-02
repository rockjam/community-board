/*
 * Copyright 2016 Nikolay Tatarinov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.rockjam.communityboard

import com.typesafe.config.ConfigFactory

object Main extends App {

  private val config = ConfigFactory.load()

  private val botToken    = config.getString("listener-bot.token")
  private val webhookHost = config.getString("listener-bot.webhook.host")
  private val webhookPort = config.getInt("listener-bot.webhook.port")

  val bot = new ListenerBot(botToken, webhookHost, webhookPort)
  bot.run()

}
