
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package webservice.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://webservice/xsd".equals(namespaceURI) &&
                  "Message".equals(typeName)){
                   
                            return  webservice.xsd.Message.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice/xsd".equals(namespaceURI) &&
                  "Order_Item".equals(typeName)){
                   
                            return  webservice.xsd.Order_Item.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice/xsd".equals(namespaceURI) &&
                  "Order_Head".equals(typeName)){
                   
                            return  webservice.xsd.Order_Head.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    