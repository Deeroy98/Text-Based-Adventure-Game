package javaapplication9;

import java.util.Scanner;

import java.util.Random; 

public class JavaApplication9
{

public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    Random rand = new Random(); 
    String SwordName;
    Boolean Weapon = false;
    String Direction;
    String DirectionA;
    String DirectionB;
    String DirectionC;
    String DirectionD;
    String DirectionE;
    String DirectionF;
    String DirectionG;
    String DirectionH;
    String Direction1I;
    String Name;
    String answer;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    
       
    System.out.println("what is your name adventurer?");
    Name = input.nextLine();
       
    System.out.println(Name  + " please you must help, a man with a chicken on his head just kidnapped my daughter," + "\n" + "He ran off down the road but i didnt get a chance to see where he was heading" + "\n" + "but from the sounds of things he plans to sacrifce my daughter in some type of demonic ritual," + "\n" + "please you must go now you are my only hope");
       
       
    System.out.println("Do you decide to help this poor women (Type yes or no)");
    answer = input.nextLine();
    answer = answer.toLowerCase().trim();
        if ("yes".equals(answer))
               
        {
           System.out.println("You hurl down the road at breakneck speed in hope of catching the cultprit" + "\n" + "however the road splits in two do you decide to go left (Quick Way) or right (Safe Way)(Type Quick way or Safe way)");
           Direction = input.nextLine();
           Direction = Direction.toLowerCase().trim();
                if ("safe way".equals(Direction)) 
                {
                    System.out.println("You stumble upon an cliff however you see the girl below being abused by the myserious man" + "\n" + "You can take the safe way down the cliff but you may be out of time to save the girl" + "\n" + " or you can choose to just simply jump (Type safe way or jump) ");
                   
                    DirectionA = input.nextLine();
                    DirectionA = DirectionA.toLowerCase().trim();
                        if ("safe way".equals(DirectionA)) 
                        {   
                            System.out.println("You make your way carefully down the cliff you managed to land unscaved however you are too late to save the girl she has already been killed" + "\n" +" You decide to return to the poor women");
                        }
                        else
                        {
                            System.out.println("You go with your gut instinct and jump off the cliff landing on the man and breaking you fall," + "\n" + "The man is disorientated and now is your chance to strike. You see him near the edge of a drop, you also see a small rock to your left and" + "\n" + "a broken branch to your right what do you do? (Type (A) to push of the cliff (B) to use the rock (C) to use the broken branch)");
                        }
                            DirectionB = input.nextLine();
                            DirectionB = DirectionB.toLowerCase().trim();
                                if ("a".equals(DirectionB))
                                {
                                    System.out.println("You lunge at the man pushing him off the cliff, lands on a rock and cracks his head open however you fall down with him and lose 20 health (Current Health is now 80)" + "\n" +"You help the girl whos struck with PTSD and can barely move and decide to head back to the women.");
                                    Weapon = true; 
                                    System.out.println("You aquire a Trident from now dead man what will you name your weapon?");
                                    SwordName = input.nextLine();
                                    System.out.println("Congratulations you have aquired " + SwordName);
                                }
                                else if ("b".equals(DirectionB))
                                {     
                                    System.out.print("You pick up the rock and launch it at the man however you are still a bit dazed from the fall and miss the man who goes on to tie you up and slowly eat you and the girl alive");
                                }
                                else
                                {
                                    System.out.print("You pick up the brach and using all of your might swing it at the man however the branch snaps and has no effect, you kneel in front of the man and accept your fate");
                                }  
                }
                else 
                {
                    System.out.println("you ran off a cliff leaving you paralised after two days of no food you die from birds slowly eating you.");
                }
        }
        else 
        {
            System.out.println("The women whips out her big gun and literally pops multiple caps in your ass. YOU ARE DEAD");
        }
       
            
            
    }
    
}
