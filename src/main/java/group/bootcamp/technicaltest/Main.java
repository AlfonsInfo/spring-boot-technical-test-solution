package group.bootcamp.technicaltest;

import group.bootcamp.technicaltest.feature.carbrand.dto.RequestGetFilteredUnitBrand;


import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		RequestGetFilteredUnitBrand request = new RequestGetFilteredUnitBrand();

		Class<?> clazz = request.getClass();
		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {
			System.out.println("Nama field: " + field.getName());
		}
	}
}

