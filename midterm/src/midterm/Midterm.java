package midterm;

import java.io.File;
import java.util.HashMap;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;

public class Midterm {
	private String input_file;
	private String query;
	
	public Midterm(String input_file, String query) throws Exception {
		this.input_file = input_file;
		this.query=query;
		
	}
	
	public void showSnippet() throws Exception {
	HashMap hashQuery =new HashMap();  //Query의 해쉬맵 생성
	File file2 = new File("./collection.xml"); //collection.xml 읽어오기
	KeywordExtractor ke = new KeywordExtractor();
	KeywordList kl = ke.extractKeyword(query, true);
	for( int k=0; k<kl.size(); k++) {
		Keyword kwrd = kl.get(k);
		hashQuery.put(kwrd.getString(), kwrd.getCnt());  
	}
	
}
}
