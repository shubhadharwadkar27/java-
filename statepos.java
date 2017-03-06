import java.io.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class statepos{

public static class Mapclass  extends Mapper<LongWritable, Text, IntWritable, Text>
{
	public void Map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String[] parts=value.toString().split(",");
		int store_id=Integer.parseInt(parts[0]);
		context.write(new IntWritable(store_id), value);
	}
}
	public static class statePartition extends Partitioner<IntWritable, Text>
	{
		public int getPartition(IntWritable key, Text value, int numReduceTasks)
		{
			String[] parts= value.toString().split(",");
			String state=parts[4];
			if(state.equalsIgnoreCase("KAR"))
			return 0;
			else
				return 1;
		}
	}
	public static class statereducer extends Reducer<IntWritable, Text, IntWritable, Text>
	{
		public void Reducer(IntWritable key, Iterable <Text> value, Context context) throws IOException, InterruptedException
		{
			int qty=0;
			String total=null;
			for (Text val : value)
			{
			String[] parts=val.toString().split(",");
			int quantity=Integer.parseInt(parts[2]);
			qty += quantity;
			String state=parts[4];
		  total=qty+ "\t" +state;
		}
		context.write(key, new Text(total));
	}
	}

	public static void main(String args[]) throws Exception {
		  Configuration conf = new Configuration();
		  Job job = Job.getInstance(conf, "PartitionText");
		  job.setJarByClass(statepos.class);
		  job.setMapperClass(Mapclass.class);
		  job.setReducerClass(statereducer.class);
		  job.setPartitionerClass(statePartition.class);
		  job.setNumReduceTasks(2);
		  job.setMapOutputKeyClass(IntWritable.class);
		  job.setMapOutputValueClass(Text.class);
		  job.setOutputKeyClass(IntWritable.class);
		  job.setOutputValueClass(Text.class);
		  //job.setOutputValueClass(NullWritable.class);
		  //job.setInputFormatClass(TextInputFormat.class);
		  //job.setOutputFormatClass(TextOutputFormat.class);
		  FileInputFormat.addInputPath(job, new Path(args[0]));
		  FileOutputFormat.setOutputPath(job, new Path(args[1]));
		  System.exit(job.waitForCompletion(true) ? 0 : 1);

		 }

			
			
}		




