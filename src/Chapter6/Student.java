package Chapter6;

import java.util.ArrayList;

public class Student {

	private String name;
	private int id;
	private ArrayList<Integer> scores = new ArrayList <Integer >();

	public Student(){
		name = "";
		id = 0;
	}

	public void setName(String nm){
		name = nm;
	}

	public String getName(){
		return name;
	}

	public void setScore(int test, int score){

		while (scores.size() < test)
		{
			scores.add(null);
		}

		scores.set(test-1,score);
	}

	public int getScore(int test){
		return scores.get(test-1);
	}

	public int getAverage(){
		int average = 0;
		for (int i : scores){
			average = average + i;
		}

		return (average / scores.size());
	}

	public int getHighSchore(){
		int highScore = 0;
		for(int i : scores){
			if (i > highScore){
				highScore = i;
			}
		}
		return highScore;
	}

	public int getId(){
		return id;
	}

	public void setId(int i){
		id = i;
	}

	public String toString(){
		String str;
		String temp = "";
		str = "Name: " + name + "\n";

		for (int i = 0; i < scores.size(); i++){
			temp = "Test " + (i + 1) + ": " + (scores.get(i)) + "\n";
			str = str + temp;
		}
		return str;
	}
}
