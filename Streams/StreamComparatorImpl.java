package Homework3.Streams;

import java.util.Comparator;

public class StreamComparatorImpl implements Comparator<StreamImpl> {

	@Override
	public int compare(StreamImpl s1, StreamImpl s2) {
		return Integer.compare(s1.getSize(), s2.getSize());
	}
}
