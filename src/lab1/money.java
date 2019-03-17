package lab1;

public class money {
  public static int yuan(int x){
	  int res=0;   //表示分配结果，res为0表示无法分配，res为1则表示可以          
	  int[] mon={50,20,5,5,1,1,1}; //该数组存储所有面额
	  if(x>83){
		  res=0; //x大于总共的金额，不可分配
	  }
	  else{  //x<=83时，进行分配
		  for(int i=0;i<7;i++){
			  if(x>=mon[i]){
				  x=x-mon[i];
			  }
		  }
		  if(x==0){
			 res=1; //若x=0,则分配成功
		  }else{
			  res=0;
		  }
	  }	  
	  return res;  //res为0表示无法分配，res为1则表示可以
  }
}
