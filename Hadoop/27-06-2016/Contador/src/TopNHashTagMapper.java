import java.io.IOException;
import java.util.TreeMap;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;

public class TopNHashTagMapper extends Mapper<Object, Text, NullWritable, Text>
{
	private TreeMap <Integer, Text> topN = new TreeMap<>();
	
	private Text palavra = new Text();
	
	public void map(Object key, Text value, Context context)throws IOException, InterruptedException{
		//capturando o paramento quantidade informado pelo usuario
		
		Configuration conf = context.getConfiguration();
		int qtd = Integer.parseInt(conf.get("qtd"));
		
		String[] listaHashTags = value.toString().toLowerCase().split("\t");
		
		//Entrada: hashtag -quantidade de hashtags
		if( listaHashTags.length < 2) {
			return;
		}
		
		topN.put(Integer.parseInt(listaHashTags[1].toLowerCase()), new Text(value));
		
		if (topN.size()>qtd) {
			topN.remove(topN.firstKey());
		}
	}
	
	protected void cleanup(Context context) throws IOException, InterruptedException {
		for ( Text t:topN.values()) {
			context.write(NullWritable.get(), t);
		}
	}
	
}

