package org.future.projectManagement.utils;

public class InsFile {
	/**
	  * 取得文件的后缀名
	  * @param filename 文件名
	  * @return
	  */
	 public static String getExt(String filename){
	  int index=filename.indexOf(".");
	  String ext=filename.substring(index+1);
	  String str="";
	  if(ext.equalsIgnoreCase("doc"))
	   str="doc"; 
	  else if(ext.equalsIgnoreCase("ppt"))
	   str="ppt";
	  else if(ext.equalsIgnoreCase("xls"))
	   str="xls";
	  else if(ext.equalsIgnoreCase("pdf"))
	   str="pdf";
	  else if(ext.equalsIgnoreCase("txt"))
	   str="txt";
	  return str;
	 }
	 /**
	  * 去掉文件的后缀名

	  * @param filename 文件名
	  * @return
	  */
	 public static String delExt(String filename){
	  int index=filename.indexOf(".");
	  String str=filename.substring(0, index);
	  return str;
	 }
	 public static void main(String [] args){
	  String s="adfasdf.ppt";
	  String e=getExt(s);
	  System.out.println("后缀名是："+e);
	  System.out.println("去掉后缀名是："+delExt(s));
	 }
	  
}
