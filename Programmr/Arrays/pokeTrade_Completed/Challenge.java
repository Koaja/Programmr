package pokeTrade_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		System.out.println("Exchange Pokemon");
		Scanner sc = new Scanner(System.in);
		String Trade = "Pikachu";
		String[] Pokemon = { "Charmeleon", "Geodude", "Gyarados", "Butterfree", "Mankey" };
		/// {write your code here

		while (true) {
			System.out.println("*" + Trade);
			System.out.println();

			for (String pokemon : Pokemon) {
				System.out.print(pokemon + " ");
			}

			System.out.println();
			System.out.println();

			System.out.print("Choose a Pokemon to exchange with " + Trade + " :");
			int exchangePokemon = sc.nextInt();

			if (exchangePokemon == 0) {
				System.exit(1);
			}

			String currentPokemon = Pokemon[exchangePokemon - 1];
			Pokemon[exchangePokemon - 1] = Trade;
			Trade = currentPokemon;

			System.out.println();
		}
		/// }
	}
}
