package Homework3;

import Homework3.LearningGroup.LearningGroup;
import Homework3.LearningGroup.LearningGroupService;
import Homework3.Streams.StreamComparatorImpl;
import Homework3.Streams.StreamImpl;
import Homework3.Streams.StreamService;
import java.util.ArrayList;

public class Controller {
	public static void CompareNSortStreams(){
		String pathFile1 = "Homework3/group001.txt";
		String pathFile2 = "Homework3/group002.txt";
		String pathFile3 = "Homework3/group003.txt";
		String pathFile4 = "Homework3/group004.txt";
		String pathFile5 = "Homework3/group005.txt";
		String pathFile6 = "Homework3/group006.txt";

		StreamImpl stream1 = new StreamImpl("stream1");
		StreamImpl stream2 = new StreamImpl("stream2");
		StreamImpl stream3 = new StreamImpl("stream3");

		stream1.addGroup(LearningGroupService.readGroup(pathFile1));
		stream1.addGroup(LearningGroupService.readGroup(pathFile2));
		stream1.addGroup(LearningGroupService.readGroup(pathFile3));
		stream2.addGroup(LearningGroupService.readGroup(pathFile4));
		stream2.addGroup(LearningGroupService.readGroup(pathFile5));
		stream3.addGroup(LearningGroupService.readGroup(pathFile6));

		ArrayList<StreamImpl> streamList = new ArrayList<>();
		streamList.add(stream1);
		streamList.add(stream2);
		streamList.add(stream3);

		System.out.println(streamList);
		StreamService.sortedStreams(streamList);
		System.out.println(streamList);
	}
}
