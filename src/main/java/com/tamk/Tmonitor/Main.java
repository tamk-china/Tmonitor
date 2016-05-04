package com.tamk.Tmonitor;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<MemoryPoolMXBean> list = ManagementFactory.getMemoryPoolMXBeans();
		for (MemoryPoolMXBean one : list) {
			System.out.print(one.getName());
			System.out.print("	");
		}
		System.out.println();
		while (true) {
			List<Double> temp = new ArrayList<Double>();
			for (int i = 0; i < 1024 * 1024; ++i) {
				temp.add(new Double(1234));
			}
			for (MemoryPoolMXBean one : list) {
				System.out.print(one.getUsage().getUsed());
				System.out.print("	");
			}
			System.out.println();
			Thread.sleep(10000);
		}
	}

}
