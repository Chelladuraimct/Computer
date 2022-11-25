package com_Computer_Programmer;

public class Hp_Pavilion {

	private void Laptop_Holder_Name() {

		int Chelladurai = 10;
		int Gowrishankar = 50;
		int Senthilkumar = Chelladurai + Gowrishankar;

		System.out.println("Hp Pavilion ec2150 Series Value" + Chelladurai);
		System.out.println("Hp Pavilion ec2100 Series Value" + Gowrishankar);
		System.out.println("Hp Pavilion ec2008 Series Value" + Senthilkumar);

	}

	public static void main(String[] args) {
		// class name object name = new class name
		Hp_Pavilion Laptop = new Hp_Pavilion();
		Laptop.Laptop_Holder_Name();

	}
}
