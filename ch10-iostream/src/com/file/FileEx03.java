package com.file;

import java.io.File;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:"+File.separator+"hanbitWeek"+File.separator+"javaSample";
		File f1 = new File(path);
		
		System.out.println("=== ���丮 ���� ===");
		System.out.println(f1.mkdir());
		
		System.out.println("=== ���丮 ���� ===");
		if(f1.delete()){
			System.out.println(f1.getName()+" ���丮 ����");
		}else{
			System.out.println("���丮�� �������� �ʽ��ϴ�.");
		}
		
		
	}

}