package com.file;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()){
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		
		//지정한 디렉토리의 하위디렉토리와 파일 정보 반환
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++){
			File f2 = files[i];
			if(f2.isDirectory()){//디렉토리의 경우
				System.out.println("["+f2.getName()+"]");
			}else{//파일인 경우
				System.out.println(f2.getName());
				System.out.println("("+f2.length()+")");
				
			}
		}
	}

}
