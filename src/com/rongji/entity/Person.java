/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年5月16日 下午5:51:49  
 *  
 */  

package com.rongji.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年5月16日 下午5:51:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年5月16日      吴有根                      1.0         1.0 Version  
 */

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1006232800951627359L;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private Person person;
	
	private void writeObject(ObjectOutputStream stream) throws IOException{
		age=age<<2;
		stream.defaultWriteObject();
	}  
	
	private void readObject(ObjectInputStream stream) throws Exception{
		stream.defaultReadObject();
		age=age<<2;
	}
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, String address, Person person) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.person = person;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", person=" + person + "]";
	}
	

}
