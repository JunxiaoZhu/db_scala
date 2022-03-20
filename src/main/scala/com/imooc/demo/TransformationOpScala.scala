package com.imooc.demo


import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable.ArrayBuffer

/**
 * 需求：Transformation实战
 * map：对集合中每个元素乘以2
 * filter：过滤出集合中的偶数
 * flatMap：将行拆分为单词
 * groupByKey：对每个大区的主播进行分组
 * reduceByKey：统计每个大区的主播数量
 * sortByKey：对主播的音浪收入排序
 * join：打印每个主播的大区信息和音浪收入
 * distinct：统计当天开播的大区信息
 * Created by xuwei
 */
object TransformationOpScala {


  def distinctOp(sc: SparkContext): Unit = {

    //由于是统计开播的大区信息，需要根据大区信息去重，所以只保留大区信息
    //dataRDD.map(_._2).distinct().foreach(println(_))
  }

}
