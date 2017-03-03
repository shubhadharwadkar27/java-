import java.io.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.apache.hadoop.mapreduce.lib.output.*;





public class StringSearch {
	public static class MapperClass  extends Mapper<LongWritable,Text,Text,NullWritable> 
	{
	private Text sentence=new Text();
	
	 public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	 {
		 String mySearchText =context.getConfiguration().get("myText");
		 String line=value.toString();
		 if(mySearchText != null)
		 {
			 if(line.contains(mySearchText))
			 {
				  sentence.set(line);
				 context.write( sentence,NullWritable.get());
				 
			 }
		 }
	 }
	
	}
	 
	 public static void main(String args[]) throws Exception {
		  Configuration conf = new Configuration();
		  if(args.length>2)
		  {
			  conf.set("myText",args[2]);
		  }
		  Job job = Job.getInstance(conf, "String Search");
		  job.setJarByClass(StringSearch.class);
		  job.setMapperClass(MapperClass.class);
		  job.setNumReduceTasks(0);
		  job.setOutputKeyClass(Text.class);
		  job.setOutputValueClass(NullWritable.class);
		  FileInputFormat.addInputPath(job, new Path(args[0]));
		  FileOutputFormat.setOutputPath(job, new Path(args[1]));
		  System.exit(job.waitForCompletion(true) ? 0 : 1);


			

		}

	}

