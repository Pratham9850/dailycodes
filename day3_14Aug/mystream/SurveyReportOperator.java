package com.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SurveyReportOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<SurveyReport> surveyList = new ArrayList<>();
		surveyList.add(new SurveyReport(1,"Peter","pune",5,7,10));
		surveyList.add(new SurveyReport(2,"Pappu","delhi",4,6,11));
		surveyList.add(new SurveyReport(3,"Soniya","vadodara",6,2,12));
		
		Stream<SurveyReport> surveystream = surveyList.stream();
		
//		SurveyReport maxRequests = surveystream.min((d1,d2) -> {
//			if(d1.getTotal_connection_request() == d2.getTotal_connection_request()) {
//				return 0;
//			}
//			else if(d1.getTotal_connection_request() > d2.getTotal_connection_request()) {
//				return 1;
//			}
//			else return -1;
//		}).get();
//		
//		System.out.println(maxRequests);
		
//		int  i = surveystream.map((e)-> e.getNo_of_days_for_request_completion()).reduce(0, (a,b) -> ((a+b)/2));
//		
//		System.out.println(i);
		
		int  i = surveystream.map((e)-> e.getAverage_request_per_day()).reduce(0, (a,b) -> (a+b));
		
		System.out.println(i);
		
////		Integer delhiCount = (int) surveystream
////                .filter((e) -> (e).getLocation().equalsIgnoreCase("Delhi"))
////                .count();
////        System.out.println("Number of reports for location Delhi: " + delhiCount);
   }

	

}
