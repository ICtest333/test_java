package com.file;

import java.io.File;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:"+File.separator+"hanbitWeek"+File.separator+"javaSample";
		File f1 = new File(path);
		
		System.out.println("=== 디렉토리 생성 ===");
		System.out.println(f1.mkdir());
		
		System.out.println("=== 디렉토리 삭제 ===");
		if(f1.delete()){
			System.out.println(f1.getName()+" 디렉토리 삭제");
		}else{
			System.out.println("디렉토리가 존재하지 않습니다.");
		}
		
		
	}

}
