package com.xworkz.chaining.boot;

import com.xworkz.chaining.app3.WirelessRouter;

public class RouterMain {
	public static void main(String[] args) {
		
		System.out.println("Invoking main in router");
		WirelessRouter router =new WirelessRouter();
		System.out.println(router.feature);
		System.out.println(router.otherName);
		System.out.println(router.function);
		System.out.println(router.type);
		
		System.out.println("_______________________________");
		
		WirelessRouter router2 =new WirelessRouter("OverFlow Routing","Gateways","Route NetWork Packets","Wireless Routing");
		System.out.println(router2.feature);
		System.out.println(router2.otherName);
		System.out.println(router2.function);
		System.out.println(router2.type);

	}

}
