package pokeTrade2_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		System.out.println("Exchange Pokemon");
		Scanner sc = new Scanner(System.in);
		String[] Pokemon = { "Pikachu", "Charmeleon", "Geodude", "Gyarados", "Butterfree", "Mankey" };
		/// {Write your code here

		while (true) {
			for (int i = 0; i < Pokemon.length; i++) {
				System.out.println(i + ":" + Pokemon[i]);
			}
			System.out.print("Choose a pokemon:");
			int pokeSwap = sc.nextInt();
			if(pokeSwap == -1){
				break;
			}
			System.out.print("Choose a pokemon to exchange with:");
			int pokeExchange = sc.nextInt();
			String temp = Pokemon[pokeExchange];
			Pokemon[pokeExchange] = Pokemon[pokeSwap];
			Pokemon[pokeSwap] = temp;
		}

		/// }
	}
}
