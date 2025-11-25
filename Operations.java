class Operations{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		switch(c){
			case 0:
				System.out.println("Addition :"+ (a+b));
				break;
			case 1:
				System.out.println("Substraction: "+ (a-b));
			         break;
			case 2:
				if(b!=0){
					System.out.println("Division: "+ (a/b));
				}else{
					System.out.println("Not Divisible by Zero");
				}
				break;
			case 3:
				if(b!=0){
                                        System.out.println("Reminder : "+ (a%b));
                                }else{
                                        System.out.println("Not Divisible by Zero");
                        	}
				break;
			default:
				System.out.println("Invaild Entry");
				break;
			}
		}
	}
