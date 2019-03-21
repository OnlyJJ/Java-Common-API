package com.learn.test;

import java.util.ArrayList;
import java.util.List;

import com.learn.tool.serializer.ProtostuffSerializer;

public class SerialzerTest {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User a = new User();
		a.setUid(120100);
		a.setAge(18);
		a.setName("jjju");
		a.setSex("女");
		list.add(a);
		byte[] data = ProtostuffSerializer.serialize(a);
		
		User b = ProtostuffSerializer.unSerialize(data);
		b.toString();
		
		User c = new User();
		c.setUid(12600);
		c.setAge(20);
		c.setName("uii");
		c.setSex("men");
		list.add(c);
		
		byte[] listSer = ProtostuffSerializer.serialize(list);
		
		List<User> listDeser  = ProtostuffSerializer.unSerialize(listSer);
		if(listDeser != null) {
			for(User user : listDeser) {
				user.toString();
			}
		}
		
	}
}
