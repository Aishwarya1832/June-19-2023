package com.xworkz.casting.util;

import com.xworkz.casting.app3.*;

public class ZooUtil extends Zoo{
	public void run(Zoo zoo) {
		Zoo zoo1 = new Zoo();
		zoo1.plays();

		if (zoo instanceof StateZoo) {
			Zoo zoo2 = new StateZoo();
			zoo2.plays();

			StateZoo state = (StateZoo) zoo2;
			state.shows();
		}

		if (zoo instanceof NationalZoo) {
			Zoo zoo3 = new NationalZoo();
			zoo3.plays();

			NationalZoo national = (NationalZoo)zoo3;
			national.animalShow();
		}
		
	}

}
