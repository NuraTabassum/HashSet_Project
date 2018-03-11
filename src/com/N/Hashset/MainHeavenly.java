package com.N.Hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainHeavenly {
	private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
	
	private static Set<HeavenlyBody> planets=new HashSet<>();
	
	public static void main(String[] args) {
		HeavenlyBody temp=new HeavenlyBody("Mercury",88,"Planet");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp=new HeavenlyBody("Venus",225,"Moon");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp=new HeavenlyBody("Earth",365,"Star");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon=new HeavenlyBody("Moon", 27,"Astroid");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp.addMoon means we are adding to satellites, since the HeavenlyBody and satellites set is final there is no set method only get methods.
		                       //there is only one method addMoon in HeavenlyBody through which u can add to satellites
		temp=new HeavenlyBody("Mars",687,"Lil");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		
		
		tempMoon=new HeavenlyBody("Deimos", 1.3,"Gk");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Mars
		
		tempMoon=new HeavenlyBody("Phobos",0.3,"Mk");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Mars
		
		temp=new HeavenlyBody("Jupiter",4332, "Hk");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon=new HeavenlyBody("Io",1.8,"lunar");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Jupiter
		
		tempMoon=new HeavenlyBody("Europa",3.5,"Mac");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Jupiter
		
		tempMoon=new HeavenlyBody("Ganymade",7.1,"Helo");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Jupiter
		
		tempMoon=new HeavenlyBody("Callisto",16.7,"Fk");
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);//temp is still Jupiter
		
		temp=new HeavenlyBody("Saturn",10759,"Galaxy");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp=new HeavenlyBody("Uranus",30660,"Lam");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp=new HeavenlyBody("Naptune",165,"Wk");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp=new HeavenlyBody("Pluto",248,"Ak");
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		//Print all the planets
		System.out.println("Planets");
		for(HeavenlyBody planet:planets){
			System.out.println("\t"+planet.getName());	
		}
		//Print Moons for Mars
		HeavenlyBody body=solarSystem.get("Mars");
		System.out.println("Moons of "+body.getName());
		for(HeavenlyBody jupiterMoon:body.getSatellites()){//jupitermoon is just a variable name
			System.out.println("\t"+jupiterMoon.getName());
		}
		//for planets taking the moon and doing forloop,i dont need to do forloop for each planet, instead pass in collections of Satellites to add that to moon list
		Set<HeavenlyBody> moons=new HashSet<>();
		for(HeavenlyBody planet:planets){
			moons.addAll(planet.getSatellites());//addall only works for sets
		}
		Moon m=new Moon("MoonName",15,"East");
		moons.add(m);
		//print moons from the moon list
		System.out.println("All Moons");
		for(HeavenlyBody moon:moons){
			System.out.println("\t"+moon.getName()+", "+moon.getBodyType());
		}
		//we are adding pluto 2 times
		//the order will be different in dif machines as sets r not ordered
		HeavenlyBody pluto=new HeavenlyBody("Pluto",842,"Pk");
		planets.add(pluto);
		//we are creating object of subclass Planet and giving it the same name "Earth" as HeavenlyBody
		Planet p=new Planet("Earth",20,"East");
		planets.add(p);
		System.out.println(p.equals(temp));
		System.out.println(temp.equals(p));
		
		for(HeavenlyBody planet:planets){
			System.out.println(planet.getName()+": "+planet.getOrbitalPeriod()+", "+planet.getBodyType());
			//will print pluto twice coz since HeavenlyBody is an object its not able to compare  they are same coz the value is different.plurto,242 pluto842
		}
		tempMoon=new HeavenlyBody("Callisto",10.7,"Ck");
		solarSystem.put(tempMoon.getName(), tempMoon);
		
		//tempMoon=new HeavenlyBody("West",16.7,"Fk");
		//solarSystem.put(tempMoon.getName(), tempMoon);
		
		//Printing all the solarSystem
		System.out.println("Solar System:");
		for(String solar:solarSystem.keySet()){
			System.out.println(solar+" : "+solarSystem.get(solar).getOrbitalPeriod()+" "+solarSystem.get(solar).getBodyType());
		}
		
		
		
		
		Object o=new Object();
		o.equals(o);//java.object.equels --it is comparing the reference of both
		"pluto".equals("");//string equels will compare the value
		//"Earth".equals("");
		
		
		
	}

}
