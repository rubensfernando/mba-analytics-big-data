import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class LeituraHDFS {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration();
		
		config.set("fs.defaultFS","hdfs://localhost:8020/");
		
		FileSystem dfs = FileSystem.get(config);
		System.out.println("Visualizando o conteudo do arquivo");
		Path arquivo = new Path(dfs.getWorkingDirectory()+"/entrada/amazon/amazon-meta.txt");
		
		FSDataInputStream  inStream = dfs.open(arquivo);
		String data = inStream.readUTF();
		System.out.println(data);
		inStream.close();
	}
}
