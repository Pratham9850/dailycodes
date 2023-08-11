package com.callquality;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class CallFeedbackDemo {

	ArrayList<CallQualityFeedback> itemList = new ArrayList<>();
	
	CallFeedbackDemo()
	{
		itemList.add(new CallQualityFeedback(1,"12121212","Description of object",4));
		itemList.add(new CallQualityFeedback(2,"12121212","Description of object2",3));
	}
	
	public void evaluateFeedback(Consumer<CallQualityFeedback> c) {
		for(CallQualityFeedback i : itemList) {
			c.accept(i);
		}
	}
	
	public void evaluateFeedback(Predicate<CallQualityFeedback> c) {
		for(CallQualityFeedback i : itemList) {
			if(c.test(i)) {
				System.out.println(i+ "Call quality is good");
			}
			else {
				System.out.println(i+ "Call quality is bad");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallFeedbackDemo obj = new CallFeedbackDemo();
		obj.evaluateFeedback((e) ->System.out.println(e) );
		obj.evaluateFeedback((e) -> e.getRating()>3 );
	}

}
