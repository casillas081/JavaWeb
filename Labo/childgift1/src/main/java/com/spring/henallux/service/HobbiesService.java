package com.spring.henallux.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.spring.henallux.model.Hobby;

@Service
public class HobbiesService {
	private ArrayList<Hobby> listHobbies;
	
	public HobbiesService(){		
		listHobbies = new ArrayList<Hobby>();
		listHobbies.add(new Hobby("1","Jeux vidéo"));
		listHobbies.add(new Hobby("2","Tennis"));
		listHobbies.add(new Hobby("3","Jeux de roles"));
		listHobbies.add(new Hobby("4","Programmation"));
		
	}

	public ArrayList<Hobby> getListHobbies() {
		return listHobbies;
	}

	public void setListHobbies(ArrayList<Hobby> listHobbies) {
		this.listHobbies = listHobbies;
	}
}
