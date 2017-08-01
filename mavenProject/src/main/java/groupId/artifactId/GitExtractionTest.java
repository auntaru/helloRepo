package groupId.artifactId;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DbPath;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.junit.Ignore;
import org.junit.Test;

public class GitExtractionTest { 
	 
    @Test 
    public void storeCommitTest() throws MalformedURLException { 
//        HttpClient httpClient = new StdHttpClient.Builder().url("http://localhost:5984").build(); 
// 
//        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient); 
//        if (dbInstance.checkIfDbExists(new DbPath("test"))) { 
//            dbInstance.deleteDatabase("test"); 
//        } 
//        CouchDbConnector db = new StdCouchDbConnector("test", dbInstance); 
//        db.createDatabaseIfNotExists(); 
// 
//        CommitCRUD commitCRUD = new CommitCRUD(db); 
//         
//        Commit commit = new Commit(); 
//        commit.setId("myid"); 
//        commit.setMessage("coucou"); 
//        commit.setReplica(42); 
//        commitCRUD.add(commit); 
//         
//        Commit result = commitCRUD.get("myid"); 
//        assertEquals("myid", result.getId()); 
//        assertEquals("coucou", result.getMessage()); 
//        assertEquals(42, result.getReplica()); 
//         
//        Commit result2 = commitCRUD.getAll().get(0); 
//        assertEquals("myid", result2.getId()); 
//        assertEquals("coucou", result2.getMessage()); 
//        assertEquals(42, result2.getReplica()); 
    } 
     
    @Ignore 
    @Test 
    public void storeAnrRetrieve() throws MalformedURLException { 
        HttpClient httpClient = new StdHttpClient.Builder().url("http://localhost:5984").build(); 
 
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient); 
        if (dbInstance.checkIfDbExists(new DbPath("test_commit"))) { 
            dbInstance.deleteDatabase("test_commit"); 
        } 
        CouchDbConnector db = new StdCouchDbConnector("test", dbInstance); 
        db.createDatabaseIfNotExists(); 
         
        fail("Not implemented yet"); 
    } 
}
