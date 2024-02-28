package comp_1000_January_assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class MyTravelPlannerTest {

	@Test
	void test01() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Snowy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+6, 0); 
		
		String expectedPlan = "Please take the 9:30 train to go to the city, and 6:30 train to get back home on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}

	void test02() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Snowy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please reschedule.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test03() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Rainy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please reschedule.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test04() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 03);
		String weather = "Snowy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please reschedule.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test05() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 03);
		String weather = "Rainy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please reschedule your appointment.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test06() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 03);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+10, 0); 
		
		String expectedPlan = "Please drive to your appoint on 2024-feb-03.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test07() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 03);
		String weather = "cloudy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please drive to your appointment on 2024-feb-03.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test08() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 03);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(11, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+7, 0); 
		
		String expectedPlan = "Please take the 10:00 train to go to the city, and 8:00 train to get back home on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test09() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(05, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+7, 30); 
		
		String expectedPlan = "Please drive to your appointment on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test10() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "snowy";
		LocalTime firstApptStart = LocalTime.of(05, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+7, 30); 
		
		String expectedPlan = "Please reschedule your appointment.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test11() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 04);
		String weather = "cloudy";
		LocalTime firstApptStart = LocalTime.of(12+1, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+7, 30); 
		
		String expectedPlan = "Please drive to your appointment on 2024-feb-04.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test12() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 04);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(12+1, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+9, 30); 
		
		String expectedPlan = "Please take the 12:00 train to go to the city, and 10:00 train to get back home on 2024-feb-04.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test13() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 12);
		String weather = "Snowy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+6, 0); 
		
		String expectedPlan = "Please take the 9:30 train to go to the city, and 6:30 train to get back home on 2024-feb-12.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test14() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 19);
		String weather = "Rainy";
		LocalTime firstApptStart = LocalTime.of(10, 30); 
		LocalTime lastApptEnd = LocalTime.of(12+6, 0); 
		
		String expectedPlan = "Please take the 10:00 train to go to the city, and 6:30 train to get back home on 2024-feb-19.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test15() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Cloudy";
		LocalTime firstApptStart = LocalTime.of(12+6, 30); 
		LocalTime lastApptEnd = LocalTime.of(12+7, 0); 
		
		String expectedPlan = "Please take the 6:00 train to go to the city, and 7:30 train to get back home on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test16() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 04);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(05, 0); 
		LocalTime lastApptEnd = LocalTime.of(06, 0); 
		
		String expectedPlan = "Please drive to your appointment on 2024-feb-04.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}
	
	void test17() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 04);
		String weather = "Rainy";
		LocalTime firstApptStart = LocalTime.of(05, 0); 
		LocalTime lastApptEnd = LocalTime.of(06, 0); 
		
		String expectedPlan = "Please drive to your appointment on 2024-feb-04.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}

	void test18() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 25);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(11, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+4, 30); 
		
		String expectedPlan = "Please take the 10:00 train to go to the city, and 6:00 train to get back home on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}

	void test19() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Snowy";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please reschedule.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}

	void test20() {
		MyTravelPlanner planner = new MyTravelPlanner();
		LocalDate date = LocalDate.of(2024, 2, 13);
		String weather = "Sunny";
		LocalTime firstApptStart = LocalTime.of(10, 0); 
		LocalTime lastApptEnd = LocalTime.of(12+11, 0); 
		
		String expectedPlan = "Please take the 9:30 train to go to the city, and 11:00 train to get back home on 2024-feb-13.";
		String actualPlan = planner.getPlan(date, weather, firstApptStart, lastApptEnd);
		assertEquals(expectedPlan, actualPlan);
	}

	
}
