package cn.csu.disnet.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	private String id;
	private String name;
	private int age;
	private String work;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String name, int age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", work=" + work + "]";
	}
	
	
	

}
