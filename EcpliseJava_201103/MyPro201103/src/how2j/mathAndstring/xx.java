package how2j.mathAndstring;
import java.util.Arrays;
import java.util.Random;
public class xx {
	

	 
	    public static void main(String[] args) {
	    	Random random=new Random();
	    	String output="";
	    	for (int i = 0; i <10; i++) {
	    		int number =random.nextInt(3);
		    	
		    	char c;
		    	switch (number) {
				case 0:	
					c=(char) (Math.random()*26+'a');
					output+=c;
					break;
				case 1:	
					c=(char) (Math.random()*26+'A');
					output+=c;
					break;
				case 3:	
					String s=Character.toString((char) (random.nextInt(9)+1));
					output+=s;
					break;
				}
		    	
			}
	    	System.out.println(output);
	    	
	    	
//	        // TODO Auto-generated method stub
//	        String[] str = new String[8];
//	        for (int i = 0; i < str.length; i++) {
//	            str[i] = getString();
//	            }
//	        System.out.println(Arrays.toString(str));
////	        System.out.println("����ǰ��" + Arrays.toString(str));
////	        str=sort(str);
////	        System.out.println("�����" +Arrays.toString(str));
	 
	    }
	    
	     
	    //��λ������ַ������޶���ĸ
//	    static String getString(){
//	        String str ="";
//	        int start = 'A';
//	        int end = 'z';
//	        for (int i = 0; i < 5; ) {
//	        char random = (char)(Math.random()*(end - start+1) +start);
//	        if(Character.isLetter(random)){
//	            str += random;  //�����ַ���ƴ������char���������ַ�������
//	            i++;
//	        }
//	        }
//	        return str;
//	    }
	     
	    //����
//	     static String[] sort(String[] str){
//	        char[] ch = new char[str.length];
//	        for(int i = 0; i < ch.length ; i++){
//	             
//	            ch[i] = str[i].charAt(0); //�ַ�������ĸ
//	            ch[i] = Character.toUpperCase(ch[i]);  //��ĿҪ�󲻷ִ�Сд��ȫ��ת��Ϊ��д
//	             
//	        }
//	         
//	        for(int i = 0; i < ch.length-1; i++){
//	            for(int j = i+1; j < ch.length ;j++){
//	                if(ch[i] > ch[j]){
//	                    //����ĸ����
//	                    char temp = ch[i];
//	                    ch[i] = ch[j];
//	                    ch[j] = temp;
//	                     
//	                    //��Ӧ���ַ�������Ҳͬʱ����
//	                    String temp1 = str[i];
//	                    str[i] = str[j];
//	                    str[j] = temp1;
//	                }
//	            }
//	             
//	        }
//	         
//	        return str;
//	    }
	 
	}
