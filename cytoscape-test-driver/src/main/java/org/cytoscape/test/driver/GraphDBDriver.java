package org.cytoscape.test.driver;

import org.openrdf.sail.Sail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerpop.blueprints.pgm.impls.sail.impls.NativeStoreSailGraph;

public class GraphDBDriver {
	
    private static final Logger logger = LoggerFactory.getLogger(GraphDBDriver.class);
    
    // Modify this! 
    private static final String DB_LOCATION = "/Users/k/sail1";
    
    GraphDBDriver() {
    	// Simply creates new databases.
    	
    	logger.info("\n\n\n********* Graph DB Driver start **********\n\n\n");
    	
    	final NativeStoreSailGraph sailGraph = new NativeStoreSailGraph(DB_LOCATION);
    	final Sail rawGraph = sailGraph.getRawGraph();
    	sailGraph.shutdown();
    	
    	logger.info("\n\n\n############# Graph DB Driver Success: " + rawGraph.toString() + "\n\n\n");
    }
}
