package how2j.mathAndstring;

import java.util.Arrays;

public class TestString {
	public static void main(String[] args) {
		String garen = "����"; // ����ֵ,�������������ֵ�ͻᴴ��һ���ַ�������

		String teemo = new String("��Ī"); // �����������ַ�������

		char[] cs = new char[] { '��', '˹', '��' };

		String hero = new String(cs);// ͨ���ַ����鴴��һ���ַ�������

		String hero3 = garen + teemo;// ͨ��+�ӺŽ����ַ���ƴ��

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
//					str += ch[j]; // �����ַ���ƴ������char���������ַ�������
//				}
//				if (j == 4) {
//					System.out.println(str);
//					str = "";
//				}
//			}
//		}
		//�ָ�==========================================
		String sentence = "               ����,�ڽ������� ��8�λ�ɱ��,��� ��     x      ���� ��  �ƺ�   x     ";
        
        //����,���зָ�õ�3�����ַ���
		String subSentence[]=sentence.split(",");
		for (String sub : subSentence) {
			System.out.println(sub);
		}
	
//=ȥ����β�ո� =====================================		
		System.out.println(sentence.trim());
		
		
		//��Сд=========================
		String word="Garen";
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		
		
		//��λ===================================
		String sentence1 = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
		System.out.println(sentence1.indexOf('8'));
		System.out.println(sentence1.indexOf("����"));
		System.out.println(sentence1.lastIndexOf('��'));
		System.out.println(sentence1.indexOf(',', 5));
		System.out.println(sentence1.contains("��ɱ"));
		
		//
		String sentencex = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
		 
        String temp = sentencex.replaceAll("��ɱ", "����ɱ"); //�滻���е�
         
        temp = temp.replaceAll("����", "����");
         
        System.out.println(temp);
         
        temp = sentencex.replaceFirst(",","");//ֻ�滻��һ��
         
        System.out.println(temp);
		
//        //��ϰ-ÿ�����ʵ�����ĸ��ת��Ϊ��д
//        
//        String w="let there be light";
//        //-->�ַ�����
//        String[] sa=w.split(" ");
//        for (String str : sa) {
//			System.out.println(str);
//		}
//        //��ȡ����ĸ��д
//       for (int i = 0; i < sa.length; i++) {
//    	   
////    	   String s=sa[i].substring(0,1).toUpperCase()+sa[i].substring(1);
////           System.out.print(s+" ");
//		String tempx;
//		String headWord=sa[i].substring(0,1);//����ĸ
//		tempx=sa[i].replaceFirst(headWord, headWord.toUpperCase());
//	
//		System.out.print(tempx+" ");
    	   
		//��ϰ-�����дСдģʽ 
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
        
        //��ϰ-Ӣ���ƿ��� 
//        String str="peter piper picked a peck of pickled peppers";
//        String[] s=str.split(" ");
//        int count=0;
//        for (int i = 0; i < s.length; i++) {
//			if (s[i].charAt(0)=='p') {
//				count+=1;
//			}
//		}
//        System.out.println("��������ĸΪP:"+count);
//        
//        //p�ĸ���
//        char[] c=str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//        	
//			if (c[i]=='p') {
//				count+=1;
//			}
//		}
//        System.out.println("p�ĸ���:"+count);
        //��ϰ-���һ����ĸ���д 
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

