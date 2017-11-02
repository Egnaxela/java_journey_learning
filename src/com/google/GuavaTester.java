package com.google;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class GuavaTester {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		
		LoadingCache employeeCache = CacheBuilder.newBuilder().maximumSize(100)//��󻺴�100����¼
				.expireAfterAccess(30, TimeUnit.MINUTES) // �����ڷ���30���Ӻ�ʧЧ
				.build(new CacheLoader() { // ����CacheLoader
					@Override
					public Object load(Object key) throws Exception {
						return getFromDatabase(key);
					}
				});

		try {
			// ��һ�ε��ã����潫����Ӧ�ķ�ʽ���
			System.out.println("Invocation #1");
			System.out.println(employeeCache.get("100"));
			System.out.println(employeeCache.get("103"));
		//	System.out.println(employeeCache.get("110"));
			// �ڶ��ε��ã����ݽ��ӻ����з���
			System.out.println("Invocation #2");
			System.out.println(employeeCache.get("100"));
			System.out.println(employeeCache.get("103"));
			System.out.println(employeeCache.get("110"));

		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static Employee getFromDatabase(Object empId) {
		Employee e1 = new Employee("Mahesh", "Finance", "100");
		Employee e2 = new Employee("Rohan", "IT", "103");
		Employee e3 = new Employee("Sohan", "Admin", "110");

		Map<Object,Employee> database = new HashMap<Object,Employee>();
		database.put("100", e1);
		database.put("103", e2);
		database.put("110", e3);
		System.out.println("Database hit for" + empId);
		return database.get(empId);
	}
}

class Employee {
   String name;
   String dept;
   String emplD;

   public Employee(String name, String dept, String empID){
      this.name = name;
      this.dept = dept;
      this.emplD = empID;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getDept() {
      return dept;
   }
   public void setDept(String dept) {
      this.dept = dept;
   }
   public String getEmplD() {
      return emplD;
   }
   public void setEmplD(String emplD) {
      this.emplD = emplD;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(Employee.class)
      .add("Name", name)
      .add("Department", dept)
      .add("Emp Id", emplD).toString();
   }	
}