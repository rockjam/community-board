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

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._

class ListenerBot(botToken: String, _url: String, _port: Int) extends TelegramBot with Webhook {
  def token: String      = botToken
  def port: Int          = _port
  def webhookUrl: String = _url

  override def handleMessage(message: Message): Unit = {
    system.log.warning(s"========message is: ${message}")
    println(s"========message is: ${message}")
  }

}
