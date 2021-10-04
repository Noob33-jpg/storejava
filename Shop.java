import java.util.Scanner;
//TINDAHAN PROGRAM BY RAFAEL RODRIGUEZ
public class Shop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//title
		System.out.print("————————————————————————————\n");
		System.out.println("\n  TINDAHAN NI MANG KANOR\n");
		System.out.println("————————————————————————————\n");
		// STARTS HERE
		System.out.println("Start a conversation\n");
		System.out.println("1 ) Buy\n2 ) exit\n");
		while (true) {
			int user;
			user = scn.nextInt();
			if (user == 1) { // IF USER INPUT 1
				System.out.println("Mang Kanor: Please choose here!");
				System.out.print("\n————————————————————————————\n");
				System.out.println("          • MENU •");
				System.out.print("————————————————————————————\n");
				System.out.println("\n1] Food\n2] Snacks\n3] drinks\n");
				int choose;
				choose = scn.nextInt();
				if (choose == 1){  //  if you choose Food 
					System.out.print("————————————————————————————\n");
					System.out.println("     • FOODS AVAILABLE •");
					System.out.print("————————————————————————————\n");
					String list = "\n1) Hotdog\n2) hamburger\n3) footlong\n4) Fries\n5) Hotcake\n"; // THE AVAILABLE FOODS IN THE SHOP
					System.out.print(list);
// BUY SYSTEM IN FOODS
					int by1;
					by1 = scn.nextInt();
					switch (by1){
						case 1:
						  System.out.println("The Hotdog is 15 pesos each\nHow many do you want to buy?\n");
						  int hme;
						  hme = scn.nextInt();
						  if (hme <= 5){
						  	System.out.println("You succesfully buyed a Hotdog\n");						  	
						  }		  
				  	  break;
						case 2:
						  System.out.println("The Hamburger is 25 pesos each\nHow many do you want to buy?\n");
						  int hme2;
						  hme2 = scn.nextInt();
						  if (hme2 <= 5){
						  	System.out.println("You succesfully buyed a HamBurger\n");						  	
						  }
						break;
						case 3:
						  System.out.println("The Footlong is 25 pesos each\nHow many do you want to buy?\n");
						  int hme3;
						  hme3 = scn.nextInt();
						  if (hme3 <= 5){
						  	System.out.println("You succesfully buyed a Footlong\n");						  	
						  }
						  break;
						case 4:
						  System.out.println("The Fries is 15 pesos each\nHow many do you want to buy?\n");
						  int hme4;
						  hme4 = scn.nextInt();
						  if (hme4 <= 5){
						  	System.out.println("You succesfully buyed a Fries\n");						  	
						  }
						break;
						case 5:
						  System.out.println("The HotCake is 10 pesos each\nHow many do you want to buy?\n");
						  int hme5;
						  hme5 = scn.nextInt();
						  if (hme5 <= 5){
						  	System.out.println("You succesfully buyed a HotCake\n");						  	
						  }
						break;
					}
				}
//End of FOOD HERE
				else if (choose == 2){// IF YOU CHOOSE SNACKS
										System.out.print("————————————————————————————\n");
					System.out.println("     • SNACKS AVAILABLE •");
					System.out.print("————————————————————————————\n");
					String list = "\n1) skyflakes\n2) rebisco\n3) wattatops\n4) PugyBar\n5) hansle";
					System.out.print(list);
					int by1;
					by1 = scn.nextInt();
					switch (by1){
						case 1:
						  System.out.println("The SkyFlakes is 6 pesos each\nHow many do you want to buy?\n");
						  int hme;
						  hme = scn.nextInt();
						  if (hme <= 5){
						  	System.out.println("You succesfully buyed a SkyFlakes\n");						  	
						  }		  
				  	  break;
						case 2:
						  System.out.println("The Rebisco is 6 pesos each\nHow many do you want to buy?\n");
						  int hme2;
						  hme2 = scn.nextInt();
						  if (hme2 <= 5){
						  	System.out.println("You succesfully buyed a Rebisco\n");						  	
						  }
						break;
						case 3:
						  System.out.println("The Wattatops is 7 pesos each\nHow many do you want to buy?\n");
						  int hme3;
						  hme3 = scn.nextInt();
						  if (hme3 <= 5){
						  	System.out.println("You succesfully buyed a Wattatops\n");						  	
						  }
						  break;
						case 4:
						  System.out.println("The PudgyBar is 7 pesos each\nHow many do you want to buy?\n");
						  int hme4;
						  hme4 = scn.nextInt();
						  if (hme4 <= 5){
						  	System.out.println("You succesfully buyed a PudgyBar\n");						  	
						  }
						break;
						case 5:
						  System.out.println("The Hansle is 7 pesos each\nHow many do you want to buy?\n");
						  int hme5;
						  hme5 = scn.nextInt();
						  if (hme5 <= 5){
						  	System.out.println("You succesfully buyed a Hansle\n");						  	
						  }
						break;
					}
					
				}//End of snacks here!!
											    	else if (choose == 3){ // IF YOU CHOOSE DRINKS
										System.out.print("————————————————————————————\n");
					System.out.println("     • DRINKS AVAILABLE •");
					System.out.print("————————————————————————————\n");
					String list = "\n1) COKE\n2) SPRITE\n3) RC\n4) PEPSI\n5) REDHORSE\n6) GIN\n";
					System.out.print(list);
					int by1;
					by1 = scn.nextInt();
					switch (by1){
						case 1:
						  System.out.println("The Coke is 10 pesos each\nHow many do you want to buy?\n");
						  int hme;
						  hme = scn.nextInt();
						  if (hme <= 5){
						  	System.out.println("You succesfully buyed a Coke\n");						  	
						  }		  
				  	  break;
						case 2:
						  System.out.println("The Sprite is 15 pesos each\nHow many do you want to buy?\n");
						  int hme2;
						  hme2 = scn.nextInt();
						  if (hme2 <= 5){
						  	System.out.println("You succesfully buyed a Sprite\n");						  	
						  }
						break;
						case 3:
						  System.out.println("The RC is 10 pesos each\nHow many do you want to buy?\n");
						  int hme3;
						  hme3 = scn.nextInt();
						  if (hme3 <= 5){
						  	System.out.println("You succesfully buyed a RC\n");						  	
						  }
						  break;
						case 4:
						  System.out.println("The Pepsi is 15 pesos each\nHow many do you want to buy?\n");
						  int hme4;
						  hme4 = scn.nextInt();
						  if (hme4 <= 5){
						  	System.out.println("You succesfully buyed a Pepsi\n");						  	
						  }
						break;
						case 5:
						  System.out.println("The Redhorse is 150 pesos each\nHow many do you want to buy?\n");
						  int hme5;
						  hme5 = scn.nextInt();
						  if (hme5 <= 5){
						  	System.out.println("You succesfully buyed a Redhorse\n");
						  }
						  break;
						  						        	case 6:
						  System.out.println("The Gin is 60 pesos each\nHow many do you want to buy?\n");
						  int hme6;
						  hme6 = scn.nextInt();
						  if (hme6 <= 5){
						  	System.out.println("You succesfully buyed a Gin\n");						
						  }
						break;
					}				
				}
			}
			// EXIT COMMAND
			else if (user == 2){
				System.exit(0);
			}
			// invalid input
			else{
				System.out.println("invalid input*");
			}
		}

	}
}