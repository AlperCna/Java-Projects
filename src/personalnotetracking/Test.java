/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alper
 */
public class Test {
   //scanner to get user input
   public  static Scanner scanner=new Scanner(System.in);
   public static void main(String[] args) {
     NoteTracker noteTracker = new NoteTracker();

     //get users Array
     User[] users=getUsers();

     //login user
       System.out.print("Enter User Name: ");
       String name=scanner.next();
       System.out.print("Enter Password: ");
       String password=scanner.next();

       boolean isLogin=false;//used to store true if user login success
       //check user in users array
       for (User user:users)
       {
           if(user.login(name,password))
               isLogin=true;
       }

       //check if user login or not
       if(!isLogin)
       {
           System.out.println("Invalid login details...");
           System.exit(0); //close the program
       }
       else
           System.out.println("Login Success!");


     //create an infinite loop to continuously run the program until user wants to exit
     while (true)
     {
        System.out.println("\n1.Add a Note\t2.Search a Note\t3.Display Notes\t4.Exit");
        System.out.print("Enter your Choice: ");
        int choice=scanner.nextInt();

        switch (choice)
        {
           case 1:
              //input title
              System.out.print("Enter Title of Note:");
              scanner.nextLine();
              System.out.println();
            String title= scanner.nextLine();
              //input note content
              System.out.print("Enter Content of Note:");
              String content=scanner.nextLine();

              //input day of month
              System.out.print("Enter Day (1-30)");
              int day=scanner.nextInt();
              //input month
              System.out.print("Enter Month (1-12)");
              int month=scanner.nextInt();
              //input year
              System.out.print("Enter Year:");
              int year=scanner.nextInt();
              //create new date object using day,month and year
              Date dateCreated=new Date(day,month,year);
              System.out.println("\t*****Select a note Type ****");
              System.out.println("1.Voice Note\t2.Reminder Note\t3.TODo Note");
              System.out.print("Enter your choice");
              int type=scanner.nextInt();
              if(type==1)
              {
                 System.out.print("Enter File Location: ");
                 String file=scanner.nextLine();
                 scanner.nextLine();
                 System.out.print("Enter Duration in minutes: ");
                 int duration=scanner.nextInt();


                 //create new object of Voice note
                 VoiceNote voiceNote=new VoiceNote(title,content,dateCreated,file,duration,dateCreated);

                 //add to NoteTaker
                 noteTracker.addNote(voiceNote);
                  System.out.println("Note Created successfully..");
              }
              else if(type==2)
              {

                 System.out.println("****Reminder Date****");
                 //input day of month
                 System.out.print("Enter Day (1-30)");
                 day=scanner.nextInt();
                 //input month
                 System.out.print("Enter Month (1-12)");
                 month=scanner.nextInt();
                 //input year
                 System.out.print("Enter Year:");
                 year=scanner.nextInt();

                 Date reminderDate=new Date(day,month,year);

                 //create a reminderNote object
                 ReminderNote reminderNote=new ReminderNote(title,content,dateCreated,reminderDate);

                 //add to NoteTaker
                 noteTracker.addNote(reminderNote);

                 System.out.println("Note Created successfully..");

              }
              else if(type==3)
              {
                 System.out.println("****Reminder Date****");
                 //input day of month
                 System.out.print("Enter Day (1-30)");
                 day=scanner.nextInt();
                 //input month
                 System.out.print("Enter Month (1-12)");
                 month=scanner.nextInt();
                 //input year
                 System.out.print("Enter Year:");
                 year=scanner.nextInt();

                 Date dueDate=new Date(day,month,year);

                 //create a ToDoNote

                 ToDo toDo=new ToDo(title,content,false,dueDate);

                 //add to NoteTaker
                 noteTracker.addNote(toDo);

                  System.out.println("Note Created successfully..");


              }
              else System.out.print("Invalid Choice!");
              break;

           case 2:  //search a note

              System.out.print("Enter title to Search: ");
              scanner.nextLine();
              System.out.println();
               String strTitle=scanner.nextLine();
             Note note= noteTracker.findNote(strTitle);
             if(note!=null)
             {
                System.out.print(note);
             }
             else System.out.print("No note found with this title");

              break;

           case 3:
              System.out.println("*******All Notes*****");
              ArrayList<Note> allNotes=noteTracker.getNotes();
              for (Note n:allNotes)
                 System.out.println(n);
              break;

           case 4:
              System.out.print("Good Bye!");
              System.exit(0);
              break;
        }

     }



    }



    //this function create some user and return the array containing users
    public static User[]  getUsers()
    {
       //create some users and add them to array
       User user1 = new User("Alper", "password", "alper@email.com");
       User user2 = new User("Samet", "password", "samet@email.com");

       //store users in array
       User allUsers[]=new User[2];
       allUsers[0]=user1;
       allUsers[1]=user2;

       return allUsers;
    }


}

