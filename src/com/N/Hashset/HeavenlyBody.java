package com.N.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	//private final String Planet;
	private final String bodyType;
	public String getBodyType() {
		return bodyType;
	}
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name,double orbitalPeriod,String bodyType){
		this.name=name;
		this.orbitalPeriod=orbitalPeriod;
		this.bodyType=bodyType;
		this.satellites=new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	public boolean addMoon(HeavenlyBody moon){
		return this.satellites.add(moon);
	}
	@Override//when u override u cannot change the inputs , name and return type
	//however if not write override compiler overloading can have same name but different parameter types wrong
	public final boolean equals(Object obj){//in equals we decide wethere we want check by name or orbitalPeriod 
		if(this==obj){               //logically as per our business we need to check by the name,there cannot be 2 planet by the same name
			return true;            //before check the name we also hv to check the class,coz we dont a planet by name pluto and astroid by name pluto.
		}
		//System.out.println("obj.getclass() is "+obj.getClass());//getting class of the objects
		//System.out.println("this.getclass() is "+this.getClass());
		//if((obj==null)||(obj.getClass()!=this.getClass())){//comparing if those classes r not null if they are equal,if they are not equal we say false (the obj is not equal)
		//	return false;}
		//otherwise we compare the get name we r ignoring the orbital period
		String objName=((HeavenlyBody)obj).getName();
		return this.name.equals(objName);
		
	}
	@Override//hashcode and equals are coming from object u can override in any situation like this like 2 human have same name but dif age u want to compare by name not age.
	public final int hashCode(){//Binary comparison where if u have 2 strings it ill compare char by char and tell u those objs r equal 
		                    //every char has a hash value those hash values ill b compared
		System.out.println("hashcode called");//add method in Hashset call hashcode itselfe to check wether the values are equal like planets.add
		return this.name.hashCode() +57;
	}
	

}
