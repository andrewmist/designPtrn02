package com.design.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Jet jet = new Jet();
    	jet.setGoAlgorithm(new GoByDrivingAlgorithm()); 
    	//jet.go();
    	jet.setGoAlgorithm(new GoByFlyingFastAlgorithm()); 
    	//jet.go();
    	jet.setGoAlgorithm(new GoByDrivingAlgorithm()); 
    	jet.go();
    	
    	System.out.println( "* THE END *" );
        
    }
}
