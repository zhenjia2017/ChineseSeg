package org.liao.seg.demo;

import java.io.IOException;

import org.liao.seg.client.Seg;



public class Demo {
	/**
	 * 粗粒度分词示例
	 * @author LHW
	 * @throws IOException 
	 */
	public static void testMax() throws IOException{
		Seg seg=Seg.getInstance("http://ics.swjtu.edu.cn/SegAPI/rest/seg","USR","PASS");
		String r=seg.maxSeg("西南交通大学位于四川省成都市金牛区聪明在于勤奋天才在于积累华罗庚专辑");
		System.out.println(r);
	}
	
	/**
	 * 细粒度分词示例
	 * @author LHW
	 * @throws IOException 
	 */
	public static void testMin() throws IOException{
		Seg seg=Seg.getInstance("http://ics.swjtu.edu.cn/SegAPI/rest/seg","USR","PASS");
		String r=seg.minSeg("西南交通大学位于四川省成都市金牛区聪明在于勤奋天才在于积累华罗庚专辑");
		System.out.println(r);
	}
	/**
	 * 添加用户自定义词库分词
	 * @author LHW
	 * @throws IOException 
	 */
	public static void testUserDictionary() throws IOException{
		Seg seg=Seg.getInstance("http://ics.swjtu.edu.cn/SegAPI/rest/seg","USR","PASS");
		/*加载用户词典；词典格式详细参考readme.txt*/
		seg.setUserDictionary("data/dic.txt");
		String r=seg.segWithUserDictionary("西南交通大学位于四川省成都市金牛区聪明在于勤奋天才在于积累华罗庚专辑");
		System.out.println(r);
	}
	
	
	public static void main(String[] args)throws IOException{
		testUserDictionary();
		testMin();
		testMax();
	}
}
