package Chapter4.IfElseProjects;

import java.util.Scanner;
import java.util.Objects;

public class StoryTime {
    public static void main(String[] args){

        // Write a program that will output the following "if you want to read a happy story type 1, if you want to hear
        // a scary story type 2" THen use an if/else statement to output whatever kind of story the user wants to read.
        // (For stories, just write a quick 2-3 sentence story).

        Scanner scanner = new Scanner(System.in);

        System.out.print("If you want to read a happy story, type 'happy', if you want to hear a scary story, type 'scary': ");
        String storyType = scanner.nextLine();

        if (Objects.equals(storyType.toLowerCase(),"happy")){
            System.out.print("Free willy was saved and jumped the net.");
        } else if (Objects.equals(storyType.toLowerCase(),"scary")){
            System.out.print("The ghost was scary!!!");
        } else {
            System.out.print("I'm not sure what to do with that input. Please run again.");
        }
    }
}
