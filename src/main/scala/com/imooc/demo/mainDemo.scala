package com.imooc.demo

object mainDemo {

  /**
   * scala 中的main方法（过程）
   * 其中项目之始
    */
  def main(args: Array[String]): Unit = {
    // val p = Person("1")
    //var ok = new Person2("1")

    /*def AA(name: String): Unit = print("Hello,")
    println(AA("11"))

    // 匿名函数 (参数名: 参数类型) => 函数体
    val say = (name: String) => print("Hello,"+name)    // 多行则加{}

    // !!! 接收其它函数 作为 当前函数的参数
    def aa(fun: (String) => Unit, name: String) { fun(name) }
    aa(say, "scala")       // 调用

    aa(name1 => println("Hello, " + name1),"scala")*/

    /*val ages = Map("jack" -> 18, "tom" -> 30, "jessic" -> 27)

    def getAge(name: String) {
      val age = ages.get(name)
      age match {
        case age == () => println("your age is " + age)
        case age != () => println("none")
      }
    }*/

    /*val age = "1"
    println(Some(age))*/

    val dataRDD = Array("hello","you","hello","me","hehe","hello","you","hello","me","hehe")

  }

}
