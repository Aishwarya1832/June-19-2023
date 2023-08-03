package com.xworkz.casting.util;

import com.xworkz.casting.app5.*;

public class ChocolateUtil extends Chocolate{
	public void run(Chocolate choco) {
		

			Chocolate choco1 = new Chocolate();
			choco1.quality();

			if (choco instanceof DarkChocolate) {
				Chocolate dark = new DarkChocolate();
				dark.quality();

				DarkChocolate dark1 = (DarkChocolate) dark;
				dark1.tasty();
			}

			if (choco instanceof CarmelChocolate) {
				Chocolate caramel = new CarmelChocolate();
				caramel.quality();

				CarmelChocolate carmel1 = (CarmelChocolate)caramel;
				carmel1.taste();
			}
		}
	}

