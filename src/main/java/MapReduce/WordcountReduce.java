package MapReduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
/**
 *  （1）用户自定义的Reducer要继承自己的父类
 *  （2）Reducer的输入数据类型对应Mapper的输出数据类型，也是KV
 *  （3）Reducer的业务逻辑写在reduce()方法中
 *  （4）Reducetask进程对每一组相同k的<k,v>组调用一次reduce()方法
 */
public class WordcountReduce extends Reducer<Text, IntWritable, Text, IntWritable> {
    /**
     * Reducetask进程对每一组相同k的<k,v>组调用一次reduce()方法
     *
     * @param key : 单词
     * @param values : 单词个数（1）的集合
     * @param context : 上下文
     * @throws IOException
     * @throws InterruptedException
     */
    IntWritable v = new IntWritable();
    int sum;
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //1、累加
        sum = 0;
        for (IntWritable value : values) {
            sum += value.get();
        }
        //2、写出
        v.set(sum);
        context.write(key, v);
    }
}
