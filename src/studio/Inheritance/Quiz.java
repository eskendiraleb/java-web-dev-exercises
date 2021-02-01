package studio.Inheritance;

import java.util.ArrayList;
import java.util.Scanner;
public class Quiz extends Question{

private ArrayList<String>multipleChoice = new ArrayList<>();
private ArrayList<String>trueFalse = new ArrayList<>();
private ArrayList<String>checkBox = new ArrayList<>();

public Quiz(String prompt, String answer, ArrayList<String> multipleChoice,
                ArrayList<String> trueFalse, ArrayList<String> checkBox) {
        super(prompt, answer);
        this.multipleChoice = multipleChoice;
        this.trueFalse = trueFalse;
        this.checkBox = checkBox;
    }
    public ArrayList<String> getMultipleChoice() {
        return multipleChoice;
    }

    public ArrayList<String> getTrueFalse() {
        return trueFalse;
    }

    public ArrayList<String> getCheckBox() {
        return checkBox;
    }

    public void multipleChoiceQuestions(){

    do {
        String setQuestions;
        Scanner input = new Scanner(System.in);
        setQuestions= input.nextLine();
        if (!setQuestions.equals("")) {
           // setQuestions = input.nextLine();
            multipleChoice.add(setQuestions);
        }

    }while (!multipleChoice.equals("")) ;
    }
    public void trueFalseQuestions(String rightOrNot){


    }
    @Override
    public void printAnswer() {

    }

}
