package com.cjf.array;

public class TestArray4 {
	public static void main(String[] args) {
		String[] s= {"����","��ѧ��","����","�Ѻ�","����"};
		String[] sBak=new String[6];
		System.arraycopy(s, 0, sBak, 0, s.length);
		for (int i = 0; i < sBak.length; i++) {
			//System.out.print(sBak[i]+"\t");
			System.out.print(sBak[i]);
		}
	}
}