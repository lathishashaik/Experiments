
public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rolls=10000;
		int count=0;
		for(int i=0;i<rolls;i++) {
			int dice1=(int)(1+(Math.random()*6));
			int dice2=(int)(1+(Math.random()*6));
			
			if(dice1==dice2*2 || dice2==dice1*2)
				count+=1;
		}
		System.out.println(count);

	}

}
