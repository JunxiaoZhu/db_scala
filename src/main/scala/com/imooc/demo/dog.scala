package com.imooc.demo

/**
 * 隐式转化：狗也能抓老鼠
 */
class dog(val name: String){
  implicit def object2Cat (obj: Object): cat = {
    if (obj.getClass == classOf[dog]) {
      val dog = obj.asInstanceOf[dog]
      new cat(dog.name)
    }
    else Nil
  }
}