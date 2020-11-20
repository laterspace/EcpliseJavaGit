package how2j.mathAndstring;

import java.util.Arrays;

public class TestString {
	public static void main(String[] args) {
		String garen = "盖伦"; // 字面值,虚拟机碰到字面值就会创建一个字符串对象

		String teemo = new String("提莫"); // 创建了两个字符串对象

		char[] cs = new char[] { '崔', '斯', '特' };

		String hero = new String(cs);// 通过字符数组创建一个字符串对象

		String hero3 = garen + teemo;// 通过+加号进行字符串拼接

//		String str = "";
//		for (int i = 0; i < 8; i++) {
//			if (((int) (Math.random() * 10)) / 2 == 0) {
//				if (((int) (Math.random() * 10)) / 2 == 0) {
//					str = str + (char) (Math.random() * 26 + 'A');
//				} else {
//					str = str + (char) (Math.random() * 26 + 'a');
//				}
//			} else {
//				str = str + (char) (Math.random() * 10 + '0');
//			}
//
//		}
//		System.out.println(str.toString());
//==========================================
//		String[] sa = new String[8];
//		String str = "";
//		System.out.println(sa.length);
//		for (int i = 0; i < sa.length; i++) {
//			for (int j = 0; j < 5; j++) {
//				char[] ch = new char[5];
//				ch[j] = (char) (Math.random() * 26 + 'A');
//				if (Character.isLetter(ch[j])) {
//					str += ch[j]; // 采用字符串拼接来加char变量加入字符串数组
//				}
//				if (j == 4) {
//					System.out.println(str);
//					str = "";
//				}
//			}
//		}
		//分隔==========================================
		String sentence = "               盖伦,在进行了连 续8次击杀后,获得 了     x      超神 的  称号   x     ";
        
        //根据,进行分割，得到3个子字符串
		String subSentence[]=sentence.split(",");
		for (String sub : subSentence) {
			System.out.println(sub);
		}
	
//=去掉首尾空格 =====================================		
		System.out.println(sentence.trim());
		
		
		//大小写=========================
		String word="Garen";
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		
		
		//定位===================================
		String sentence1 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
		System.out.println(sentence1.indexOf('8'));
		System.out.println(sentence1.indexOf("超神"));
		System.out.println(sentence1.lastIndexOf('了'));
		System.out.println(sentence1.indexOf(',', 5));
		System.out.println(sentence1.contains("击杀"));
		
		//
		String sentencex = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
		 
        String temp = sentencex.replaceAll("击杀", "被击杀"); //替换所有的
         
        temp = temp.replaceAll("超神", "超鬼");
         
        System.out.println(temp);
         
        temp = sentencex.replaceFirst(",","");//只替换第一个
         
        System.out.println(temp);
		
//        //练习-每个单词的首字母都转换为大写
//        
//        String w="let there be light";
//        //-->字符数组
//        String[] sa=w.split(" ");
//        for (String str : sa) {
//			System.out.println(str);
//		}
//        //换取首字母大写
//       for (int i = 0; i < sa.length; i++) {
//    	   
////    	   String s=sa[i].substring(0,1).toUpperCase()+sa[i].substring(1);
////           System.out.print(s+" ");
//		String tempx;
//		String headWord=sa[i].substring(0,1);//首字母
//		tempx=sa[i].replaceFirst(headWord, headWord.toUpperCase());
//	
//		System.out.print(tempx+" ");
    	   
		//练习-间隔大写小写模式 
//		String str="lengendary";
//		String output="";
//		for (int i = 0; i < str.length(); i++) {
//			if (i%2==0) {
//				output+=str.substring(i, i+1).toUpperCase();
//			}else {
//				output+=str.substring(i, i+1).toLowerCase();
//			}
//		}
//		System.out.println(output);
        
        //练习-英文绕口令 
//        String str="peter piper picked a peck of pickled peppers";
//        String[] s=str.split(" ");
//        int count=0;
//        for (int i = 0; i < s.length; i++) {
//			if (s[i].charAt(0)=='p') {
//				count+=1;
//			}
//		}
//        System.out.println("单词首字母为P:"+count);
//        
//        //p的个数
//        char[] c=str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//        	
//			if (c[i]=='p') {
//				count+=1;
//			}
//		}
//        System.out.println("p的个数:"+count);
        //练习-最后一个字母变大写 
//        String s="lengendary";
//        int last=s.length();
//        String s2=s.substring(0, last-1)+s.substring(last-1).toUpperCase();
//        System.out.println(s2);
        //
        String stt = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
  
     
     
            char[] c = stt.toCharArray();
            for(int i=stt.lastIndexOf("two");i<stt.lastIndexOf("two")+3;i++ ){
                c[i] = Character.toUpperCase(c[i]);
            }
            System.out.println(String.valueOf(c));
		System.out.println(stt.lastIndexOf("two"));;
		
		
	}
        
        
        
        
	}

