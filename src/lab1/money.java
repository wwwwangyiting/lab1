package lab1;

public class money {
  public static int yuan(int x){
	  int res=0;   //��ʾ��������resΪ0��ʾ�޷����䣬resΪ1���ʾ����          
	  int[] mon={50,20,5,5,1,1,1}; //������洢�������
	  if(x>83){
		  res=0; //x�����ܹ��Ľ����ɷ���
	  }
	  else{  //x<=83ʱ�����з���
		  for(int i=0;i<7;i++){
			  if(x>=mon[i]){
				  x=x-mon[i];
			  }
		  }
		  if(x==0){
			 res=1; //��x=0,�����ɹ�
		  }else{
			  res=0;
		  }
	  }	  
	  return res;  //resΪ0��ʾ�޷����䣬resΪ1���ʾ����
  }
}
