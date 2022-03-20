package com.imooc.demo

// 同一个.scala文件中，同名的类和对象互为彼此的"伴生类"和"伴生对象" (同一个object中)
object Person {
  val fdNum= 1

  def apply(name: String) = {        // apply方法，让创建对象更加简洁
    println("apply exec...")
    new Person(name)
  }
}
class Person(val name: String) {
  def sayHello = println("Hi," + name + Person.fdNum) // 可以互相访问
}