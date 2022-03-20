package com.imooc.demo

class Person2(val name:String = "jun"){    // 主构造函数（入参可带默认值）
  def sayHello(){
    println("Hello")
  }

  var age:Int = 0
  def this(age: Int) {
    this()
    this.age = age
  }

  // 不在方法（或代码块）中的代码就是主构造函数的代码
  println("主构造函数的代码")
}
