package zzz;
 import java.io.IOException;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
public class AddDocuments {

	public static void main(String[] args)throws IOException, SolrServerException {
		
		//Preparing the Solr client 
	      String urlString = "http://localhost:8983/solr/222_core"; 
	      SolrClient Solr = new HttpSolrClient.Builder(urlString).build();   
	      
	      //Preparing the Solr document 
	      SolrInputDocument doc = new SolrInputDocument(); 
	   
	      //Adding fields to the document 
	      doc.addField("id", "003"); 
	      doc.addField("name", "Shruti"); 
	      doc.addField("age","23"); 
	      doc.addField("addr","Belgaum"); 
	         
	      //Adding the document to Solr 
	      Solr.add(doc);         
	         
	      //Saving the changes 
	      Solr.commit(); 
	      System.out.println("Documents added");
		   } 
	}


