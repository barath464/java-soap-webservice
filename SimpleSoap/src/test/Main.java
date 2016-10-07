package test;

import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class Main {

	public static void main(String[] args){
		
			System.out.println("please enter the ip address");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String i = sc.next();
			GeoIPService geo = new GeoIPService();
			GeoIPServiceSoap soap=geo.getGeoIPServiceSoap();
			GeoIP geoip = soap.getGeoIP(i);
			System.out.println(geoip.getCountryCode());
			System.out.println(geoip.getCountryName());
		}
		
	}
	
	
