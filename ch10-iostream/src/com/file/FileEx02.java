package com.file;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:"+File.separator+"hanbitWeek"+File.separator+"sample.txt";
		File f1 = new File(path);
		System.out.println("===파일생성===");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===파일정보===");
		System.out.println("절대경로 : "+f1.getAbsolutePath());
		System.out.println("디렉토리명 : "+f1.getParent());
		System.out.println("파일명 : "+f1.getName());
		
		System.out.println("===파일명 변경===");
		File f2 = new File("C:"+File.separator+"hanbitWeek"+File.separator+"sample2.txt");
		System.out.println(f1.renameTo(f2));
		
		System.out.println("===파일 삭제===");
		if(f2.delete()){
			System.out.println(f2.getName()+" 파일삭제");
		}else{
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
