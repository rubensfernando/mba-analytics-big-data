import java.io.IOException;
import java.util.TreeMap;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TopNHashTagReducer extends Reducer<NullWritable, Text, NullWritable, Text> {
	private TreeMap<Integer, Text> topN = new TreeMap<>();
	
	public void reduce(NullWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		for (Text value : values ) {
			String[] hashtags = value.toString().toLowerCase().split("\t");
			
			//capturando o paramentto qtd informado pelo usuario
			Configuration conf = context.getConfiguration();
			int qtd = Integer.parseInt(conf.get("qtd"));
			
			topN.put(Integer.parseInt(hashtags[1].toLowerCase()), new Text(value));
			
			if (topN.size() > qtd) {
				topN.remove(topN.firstKey());
			}					
		}
		for (Text word:topN.descendingMap().values()) {
			context.write(NullWritable.get(), word);
		}
	}
}
