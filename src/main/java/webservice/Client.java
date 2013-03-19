package webservice;

import java.rmi.RemoteException;

import webservice.xsd.Message;
import webservice.xsd.Order_Head;
import webservice.xsd.Order_Item;

public class Client {

	
	  public static void main(String[] args) throws RemoteException {
		//�����ù�������wsdl�ļ�  �ٸ���wsdl�ļ����ɱ���java�ͻ��˴���,���е���
		OrderServiceStub orderServiceStub = new OrderServiceStub("http://localhost/axis2/services/OrderService");
		ModifyOrder modifyOrder = new ModifyOrder();
		Order_Head order_Head = new Order_Head();
		order_Head.setBSTKD("aaaa");
		Order_Item order_Item = new Order_Item();
		order_Item.setEDATU_N("ccc");
		modifyOrder.setHeads(new Order_Head[]{order_Head});
		modifyOrder.setItems(new Order_Item[]{order_Item});
		ModifyOrderResponse response = orderServiceStub.modifyOrder(modifyOrder);
		Message get_return = response.get_return();
		System.out.println(get_return);
	}
}
