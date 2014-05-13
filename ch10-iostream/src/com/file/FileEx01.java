package com.file;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()){
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		
		//������ ���丮�� �������丮�� ���� ���� ��ȯ
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++){
			File f2 = files[i];
			if(f2.isDirectory()){//���丮�� ���
				System.out.println("["+f2.getName()+"]");
			}else{//������ ���
				System.out.println(f2.getName());
				System.out.println("("+f2.length()+")");
				
			}
		}
	}

}
