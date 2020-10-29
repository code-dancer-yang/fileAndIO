package logindemo.ismart.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	
	private String name;
	private Integer age;
	private Date birthday;
	
	/**
	 * 格式化日期数据
	 * @return
	 */
	
	public String getBirthdayStr() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		if(birthday!=null) {
			return sdf.format(birthday);
		}else {
			return "";
		}
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	

}
