package com.ty.manytomany_uni_lang.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.manytomany_uni.lan.dao.PersonDao;
import com.ty.manytomany_uni.lan.dto.Language;
import com.ty.manytomany_uni.lan.dto.Person;



public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonDao personda = new PersonDao();
		boolean condition = false;
		do {
			System.out.println(" 1.insert \n 2.update \n 3.delete \n 4.retrive by id \n 5.retrive all ");
			System.out.println("enter your choice ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				Person person = new Person();
				System.out.println("enter person id");
				int id = scanner.nextInt();
				System.out.println("enter person name");
				String name = scanner.next();
				System.out.println("enetr phone number");
				long phone = scanner.nextLong();
				System.out.println("enter address");
				String address = scanner.next();

				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);

				Person person1 = new Person();
				System.out.println("enter person id");
				int id1 = scanner.nextInt();
				System.out.println("enter person name");
				String name1 = scanner.next();
				System.out.println("enetr phone number");
				long phone1 = scanner.nextLong();
				System.out.println("enter address");
				String address1 = scanner.next();

				person1.setId(id1);
				person1.setName(name1);
				person1.setPhone(phone1);
				person1.setAddress(address1);

				Person person2 = new Person();
				System.out.println("enter person id");
				int id2 = scanner.nextInt();
				System.out.println("enter person name");
				String name2 = scanner.next();
				System.out.println("enetr phone number");
				long phone2 = scanner.nextLong();
				System.out.println("enter address");
				String address2 = scanner.next();

				person2.setId(id2);
				person2.setName(name2);
				person2.setPhone(phone2);
				person2.setAddress(address2);

				Language language = new Language();
				System.out.println("enter id");
				int lid = scanner.nextInt();
				System.out.println("enter language");
				String lname = scanner.next();
				System.out.println("enter origin ");
				String origin = scanner.next();
				System.out.println("enetr country name");
				String country = scanner.next();

				language.setId(lid);
				language.setName(lname);
				language.setOrigin(origin);
				language.setCountry(country);

				Language language1 = new Language();
				System.out.println("enter id");
				int lid1 = scanner.nextInt();
				System.out.println("enter language");
				String lname1 = scanner.next();
				System.out.println("enter origin ");
				String origin1 = scanner.next();
				System.out.println("enetr country name");
				String country1 = scanner.next();

				language1.setId(lid1);
				language1.setName(lname1);
				language1.setOrigin(origin1);
				language1.setCountry(country1);

				Language language2 = new Language();

				System.out.println("enter id");
				int lid2 = scanner.nextInt();
				System.out.println("enter language");
				String lname2 = scanner.next();
				System.out.println("enter origin ");
				String origin2 = scanner.next();
				System.out.println("enetr country name");
				String country2 = scanner.next();

				language2.setId(lid2);
				language2.setName(lname2);
				language2.setOrigin(origin2);
				language2.setCountry(country2);

				List<Language> list1LAnguage = new ArrayList<Language>();
				list1LAnguage.add(language);
				list1LAnguage.add(language1);

				List<Language> list2LAnguage = new ArrayList<Language>();
				list2LAnguage.add(language1);
				list2LAnguage.add(language2);

				List<Language> list3Language = new ArrayList<Language>();
				list3Language.add(language);
				list3Language.add(language1);
				list3Language.add(language2);

				person.setList(list1LAnguage);
				person1.setList(list2LAnguage);
				person2.setList(list3Language);
				String origin21 = scanner.next();
				System.out.println("enetr country name");
				String country21 = scanner.next();

				language2.setId(lid2);
				language2.setName(lname2);
				language2.setOrigin(origin21);
				language2.setCountry(country21);

				List<Language> list1LAnguage1 = new ArrayList<Language>();
				list1LAnguage1.add(language);
				list1LAnguage1.add(language1);

				List<Language> list2LAnguage1 = new ArrayList<Language>();
				list2LAnguage1.add(language1);
				list2LAnguage1.add(language2);

				List<Language> list3Language1 = new ArrayList<Language>();
				list3Language1.add(language);
				list3Language1.add(language1);
				list3Language1.add(language2);

				person.setList(list1LAnguage1);
				person1.setList(list2LAnguage1);
				person2.setList(list3Language1);
				List<Person> listPerson = new ArrayList<Person>();
				listPerson.add(person);
				listPerson.add(person1);
				listPerson.add(person2);

				List<Language> listLanguages = new ArrayList<Language>();
				listLanguages.add(language);
				listLanguages.add(language1);
				listLanguages.add(language);
				personda.save(listPerson, listLanguages);
			}
			break;
			case 2: {
				System.out.println("enter id");
				int id = scanner.nextInt();
				System.out.println("enter name");
				String name = scanner.next();

				personda.update(id, name);

			}
				break;
			case 3: {
				System.out.println("enter id");
				int id = scanner.nextInt();
				personda.delete(id);
			break;
			}
			case 4: {
				System.out.println("enter id");
				int id = scanner.nextInt();
				personda.retriveById(id);
			}
				break;
			case 5: {
				personda.retriveALl();
			}
				break;
			default:
				break;
			}

		} while (condition);

	}
}
