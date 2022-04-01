package by.tc.task01.main;

import by.tc.task01.entity.bean.Appliance;

import java.util.List;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {
		for (Appliance appliance : appliances) {
			System.out.println(appliance.toString());
		}
	}
}
