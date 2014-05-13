package com.file;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:"+File.separator+"hanbitWeek"+File.separator+"sample.txt";
		File f1 = new File(path);
		System.out.println("===���ϻ���===");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===��������===");
		System.out.println("������ : "+f1.getAbsolutePath());
		System.out.println("���丮�� : "+f1.getParent());
		System.out.println("���ϸ� : "+f1.getName());
		
		System.out.println("===���ϸ� ����===");
		File f2 = new File("C:"+File.separator+"hanbitWeek"+File.separator+"sample2.txt");
		System.out.println(f1.renameTo(f2));
		
		System.out.println("===���� ����===");
		if(f2.delete()){
			System.out.println(f2.getName()+" ���ϻ���");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}