package Homework3.Streams;

import java.util.ArrayList;

public class StreamService {
	public static void sortedStreams(ArrayList<StreamImpl> streams){
		StreamComparatorImpl comparator = new StreamComparatorImpl();
		streams.sort(comparator);
	}
}
