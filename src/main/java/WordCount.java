import scala.Tuple2;

import java.util.Arrays;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * @author JunxiaoZhu
 */
public class WordCount {

    public static void main(String[] args) {
        //第一步：创建SparkContext
        SparkConf conf = new SparkConf();
        conf.setAppName("WordCountScala1")//设置任务名称
                .setMaster("local");//local表示在本地执行
        var sc = new JavaSparkContext(conf);

        //第二步：加载数据
        var linesRDD = sc.textFile("/Users/zhujunxiao/Downloads/学习资料/bigdata_course_materials/spark/上/hello.txt");

        //第三步：对数据进行切割，把一行数据切分成一个一个的单词
        JavaRDD<String> wordsRDD = linesRDD.flatMap(a1 -> { return  Arrays.asList(a1.split(" ")).iterator(); });

        //第四步：迭代words,将每个word转化为(word,1)这种形式
        var pairRDD = wordsRDD.mapToPair(a1 ->  new Tuple2<String, Integer>(a1, 1));

        //第五步：根据key(其实就是word)进行分组聚合统计
        var wordCountRDD = pairRDD.reduceByKey((a1,a2) ->  a1 + a2);

        //第六步：将结果打印到控制台
        wordCountRDD.foreach(wordCount->System.out.println(wordCount._1+"--"+wordCount._2));

        //第七步：停止SparkContext
        sc.stop();
    }

}
