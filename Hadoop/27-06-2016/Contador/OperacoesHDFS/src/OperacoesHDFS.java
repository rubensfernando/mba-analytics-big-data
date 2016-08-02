import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class OperacoesHDFS {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration();

		config.set("fs.defaultFS", "hdfs://localhost:8020/");

		FileSystem dfs = FileSystem.get(config);

		System.out.println("Criando diretorio entrada");
		String nomeDir = "entrada";
		Path caminhoDir = new Path(dfs.getWorkingDirectory() + "/" + nomeDir);
		dfs.mkdirs(caminhoDir);

		System.out.println("Criando sub-diretorio amazon");
		String nomeSubDir = "amazon";
		Path caminhoSubDir = new Path(dfs.getWorkingDirectory() + "/" + nomeDir
				+ "/" + nomeSubDir);
		dfs.mkdirs(caminhoSubDir);

		System.out.println("Enviando arquivo da base local para o hdfs");
		Path caminhoLocal = new Path("/home/training/bases/amazon-meta.txt");
		Path destino = new Path(dfs.getWorkingDirectory()+"/"+nomeDir+"/"+nomeSubDir);
		dfs.copyFromLocalFile(caminhoLocal, destino);
		
		System.out.println("Verificando o fator de replicacao");
		System.out.println(dfs.getDefaultReplication(destino));
		
		System.out.println("verificando o tamanho do bloco");
		System.out.println(dfs.getDefaultBlockSize(destino));
		
		dfs.close();
		
		
		
		
	}
}
