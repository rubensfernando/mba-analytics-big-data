import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;

public class ContaPalavrasMapper extends
		Mapper<Object, Text, Text, IntWritable> {

	private final static IntWritable numeroum = new IntWritable(1);

	public void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString().replaceAll("[^a-zA-Z ]", "").toLowerCase());
		while (itr.hasMoreTokens()) {
			context.write(new Text(itr.nextToken()), numeroum);
		}
	}

}