package com.chen.date201103;
/**
 * 测试参数传值机制
 * @author 高淇
 *
 */
public class TestStatic {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
       
    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }
      
    public   void   testParameterTransfer01(TestStatic  u){
        u.name="高小八";
    }
     
    public   void   testParameterTransfer02(TestStatic  u){
        u  =  new  TestStatic(200,"高三");
    }
      
    public static void main(String[] args) {
    	TestStatic   u1  =  new TestStatic(100, "高小七");
         
        u1.testParameterTransfer01(u1); 
        System.out.println(u1.name);
 
        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
