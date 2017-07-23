package com.shashank.implicits.datatype_conversions

import spray.json.{JsBoolean, JsObject, JsString}

/**
  * Created by shashank on 23/07/2017.
  */
object ConversionImplicits {

  implicit def userToJsObject(x: User) = JsObject(Map("userId" -> JsString(x.userId),
                                             "email" -> JsString(x.email),
                                             "isAdmin" -> JsBoolean(x.isAdmin)))

}
