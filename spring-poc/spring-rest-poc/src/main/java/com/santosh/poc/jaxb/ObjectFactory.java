//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.17 at 06:32:22 PM IST 
//


package com.santosh.poc.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SingularResponse }
     * 
     */
    public SingularResponse createSingularResponse() {
        return new SingularResponse();
    }

    /**
     * Create an instance of {@link SingularResponse.Value }
     * 
     */
    public SingularResponse.Value createSingularResponseValue() {
        return new SingularResponse.Value();
    }

    /**
     * Create an instance of {@link SingularResponse.Value.Results }
     * 
     */
    public SingularResponse.Value.Results createSingularResponseValueResults() {
        return new SingularResponse.Value.Results();
    }

}
