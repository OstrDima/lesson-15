package ua.ostr_1;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Введіть 0, щоб вийти з програми");
		System.out.println("Введіть 1, щоб зареєструвати нового учасника зооклубу");
		System.out.println("Введіть 2, щоб додати тварину учаснику зооклубу");
		System.out.println("Введіть 3, щоб видалити тварину в учасника зооклубу");
		System.out.println("Введіть 4, щоб видалити учасника із зооклубу");
		System.out.println("Введіть 5, щоб видалити введену тварину у всіх учасників зооклубу");
		System.out.println("Введіть 6, щоб вивести зооклуб на екран");
	}

	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				zooClub.addZooClubMember();
				break;
			}

			case 2: {
				zooClub.addAnimal();
				break;
			}

			case 3: {
				zooClub.removeAnimal();
				break;
			}

			case 4: {
				zooClub.removeZooClubMember();
				break;
			}

			case 5: {
				zooClub.removeAnimalFromAllMembers();
				break;
			}

			case 6: {
				zooClub.viewZooClub();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введіть число від 0 до 6");
				break;
			}
			}
		}

	}

}
