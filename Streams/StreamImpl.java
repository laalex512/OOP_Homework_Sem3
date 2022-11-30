package Homework3.Streams;

import Homework3.LearningGroup.LearningGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class StreamImpl implements Iterable<LearningGroup>{
	private String name;
	private ArrayList<LearningGroup> groupList;
	private int groupIndex = 0;

	public StreamImpl(String name){
		this.name = name;
		this.groupList = new ArrayList<>();
	}

	public void addGroup(LearningGroup group){
		this.groupList.add(group);
	}

	@Override
	public Iterator<LearningGroup> iterator() {
		Iterator<LearningGroup> iter = new Iterator<LearningGroup>(){
			@Override
			public boolean hasNext() {
				return groupIndex < groupList.size();
			}

			@Override
			public LearningGroup next() {
				if (this.hasNext()){
					return groupList.get(groupIndex++);
				}
				return null;
			}
		};
		return iter;
	}

	public void remove() {
		groupList.remove(this.groupIndex-1);
	}

	public int getSize(){
		return this.groupList.size();
	}

	@Override
	public String toString() {
		return String.format("Size of %s: %d",this.name ,this.groupList.size());
	}
}
