public class Choinka{
  public static void main(String[] args){
	  if(args.length > 0){
		  int wys = Integer.parseInt(args[0]);
	  for(int i=0; i <= wys ; i++){
			  for(int j=0; j < i - 1; j++){
				System.out.print("*");
		}
		System.out.println(" ");
	  }
	  for(int k=0; k <1 ; k++){
		  System.out.println("*");
	  }
	
  }
  }
    }
