/**
 * ConversionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka;

public interface ConversionService extends javax.xml.rpc.Service {
    public java.lang.String getConversionAddress();

    public co.edureka.Conversion getConversion() throws javax.xml.rpc.ServiceException;

    public co.edureka.Conversion getConversion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
