package com.chen.date201103;
/**
 * ���Բ�����ֵ����
 * @author ���
 *
 */
public class TestStatic {
    int id;        //id
    String name;   //�˻���
    String pwd;   //����
       
    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }
      
    public   void   testParameterTransfer01(TestStatic  u){
        u.name="��С��";
    }
     
    public   void   testParameterTransfer02(TestStatic  u){
        u  =  new  TestStatic(200,"����");
    }
      
    public static void main(String[] args) {
    	TestStatic   u1  =  new TestStatic(100, "��С��");
         
        u1.testParameterTransfer01(u1); 
        System.out.println(u1.name);
 
        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
