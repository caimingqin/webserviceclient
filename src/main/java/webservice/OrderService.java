

/**
 * OrderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /*
     *  OrderService java interface
     */

    public interface OrderService {
          

        /**
          * Auto generated method signature
          * 
                    * @param modifyOrder0
                
         */

         
                     public webservice.ModifyOrderResponse modifyOrder(

                        webservice.ModifyOrder modifyOrder0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param modifyOrder0
            
          */
        public void startmodifyOrder(

            webservice.ModifyOrder modifyOrder0,

            final webservice.OrderServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    