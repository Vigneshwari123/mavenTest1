package com.slokam.sample1.controller;

public class Student {
private Integer id;
private String name;
private Integer age;
private String qual;

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", qual=" + qual + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}

}
