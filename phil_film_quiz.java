//Marion Murzello, Hoa Huynh & Noah Kramer
//Philosophy and Film Creative Assignment
//JFK Conspiracy Theory Personality Quiz

import java.util.Scanner;

public class phil_film_quiz
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      int [] X = new int[19];
      int max = 0;

      System.out.println("Which JFK Assassination Conspiracy Theory Best Fits You?");

      System.out.println("\nQuestion 1: Choose a JFK quote that best describes you.");
      System.out.println("1. \"Forgive your enemies, but never forget their names.\"");
      System.out.println("2. \"Conformity is the jailer of freedom and the enemy of growth.\"");
      System.out.println("3. \"Those who make peaceful revolution impossible will make violent revolution.\"");
      System.out.println("4. \"Ask not what your country can do for you; ask what you can do for your country.\"");
      System.out.println("5. \"Ich bin ein Berliner.\" (I am a jelly donut)");
      System.out.print("Your Answer: ");
      X[0] = scan.nextInt();

      System.out.println("\nQuestion 2: What's your favorite conspiracy theory?");
      System.out.println("1. The moon landing was faked");
      System.out.println("2. I don't believe in conspiracy theories");
      System.out.println("3. 9/11 was executed by the US government");
      System.out.println("4. The earth is flat");
      System.out.println("5. Reptilian people exist");
      System.out.print("Your Answer: ");

      X[1] = scan.nextInt();

      System.out.println("\nQuestion 3: What do you do when you first wake up in the morning?");
      System.out.println("1. Eat breakfast without brushing your teeth");
      System.out.println("2. Brush your teeth");
      System.out.println("3. Read the communist manifesto");
      System.out.println("4. Instagram/Snap streaks");
      System.out.println("5. Look for crop circles");
      System.out.print("Your Answer: ");
      X[2] = scan.nextInt();

      System.out.println("\nQuestion 4: What is your favorite book?");
      System.out.println("1. Diary of a Wimpy Kid");
      System.out.println("2. 1984");
      System.out.println("3. Communist Manifesto");
      System.out.println("4. Pride and Prejudice");
      System.out.println("5. Warrior Cats");
      System.out.print("Your Answer: ");
      X[3] = scan.nextInt();

      System.out.println("\nQuestion 5: Who is your celebrity crush?");
      System.out.println("1. Jack Ruby");
      System.out.println("2. Barack Obama");
      System.out.println("3. Karl Marx");
      System.out.println("4. Zac Efron");
      System.out.println("5. Baby Yoda");
      System.out.print("Your Answer: ");
      X[4] = scan.nextInt();

      System.out.println("\nQuestion 6: What is your Hogwarts House?");
      System.out.println("1. Ravenclaw");
      System.out.println("2. Hufflepuff");
      System.out.println("3. Slytherin");
      System.out.println("4. Gryffindor");
      System.out.println("5. I'm a muggle");
      System.out.print("Your Answer: ");
      X[5] = scan.nextInt();

      System.out.println("\nQuestion 7: What is your political view?");
      System.out.println("1. Republican");
      System.out.println("2. Democrat");
      System.out.println("3. Third Party/Neither");
      System.out.println("4. What is politics?");
      System.out.println("5. Alien Party");
      System.out.print("Your Answer: ");
      X[6] = scan.nextInt();

      System.out.println("\nQuestion 8: What is your favorite color?");
      System.out.println("1. Black");
      System.out.println("2. Blue");
      System.out.println("3. Red");
      System.out.println("4. Other");
      System.out.println("5. White like a UFO");
      System.out.print("Your Answer: ");
      X[7] = scan.nextInt();
 
      System.out.println("\nQuestion 9: What is your favorite school subject?");
      System.out.println("1. Math");
      System.out.println("2. Science");
      System.out.println("3. English");
      System.out.println("4. Lunch");
      System.out.println("5. Study Hall so I can go to the library and read about aliens");
      System.out.print("Your Answer: ");
      X[8] = scan.nextInt();

      System.out.println("\nQuestion 10: Where is your favorite place to hang out at Villanova?");
      System.out.println("1. Campco");
      System.out.println("2. Oreo");
      System.out.println("3. Cyber Lounge");
      System.out.println("4. The Courts");
      System.out.println("5. The Crop Circle behind the Tennis Courts");
      System.out.print("Your Answer: ");
      X[9] = scan.nextInt();
      
      System.out.println("\nQuestion 11: What college are you in?");
      System.out.println("1. Engineering");
      System.out.println("2. Nursing");
      System.out.println("3. Arts");
      System.out.println("4. Business");
      System.out.println("5. Science");
      System.out.print("Your Answer: ");
      X[10] = scan.nextInt();

      System.out.println("\nQuestion 12: What did you want to be when you were a kid?");
      System.out.println("1. Engineer");
      System.out.println("2. Firefighter");
      System.out.println("3. Teacher");
      System.out.println("4. Doctor");
      System.out.println("5. Astronaut");
      System.out.print("Your Answer: ");
      X[11] = scan.nextInt();
   
      System.out.println("\nQuestion 13: What's your favorite candy?");
      System.out.println("1. Jolly Ranchers");
      System.out.println("2. Starbursts");
      System.out.println("3. Salt Water Taffy");
      System.out.println("4. Chocolate");
      System.out.println("5. Milky Way");
      System.out.print("Your Answer: ");
      X[12] = scan.nextInt();
   
      System.out.println("\nQuestion 14: What's your go to vacation spot?");
      System.out.println("1. The White House");
      System.out.println("2. Mountains");
      System.out.println("3. Russia");
      System.out.println("4. The beach");
      System.out.println("5. Area 51");
      System.out.print("Your Answer: ");
      X[13] = scan.nextInt();

      System.out.println("\nQuestion 15: What's your favorite movie?");
      System.out.println("1. The Matrix");
      System.out.println("2. Harry Potter");
      System.out.println("3. Joker");
      System.out.println("4. The Notebook");
      System.out.println("5. Apollo 13");
      System.out.print("Your Answer: ");
      X[14] = scan.nextInt();
      
      System.out.println("\nQuestion 16: What's your favorite holiday?");
      System.out.println("1. Christmas");
      System.out.println("2. Thanksgiving");
      System.out.println("3. Karl Marx's Birthday");
      System.out.println("4. My birthday");
      System.out.println("5. Halloween");
      System.out.print("Your Answer: ");
      X[15] = scan.nextInt();
      
      System.out.println("\nQuestion 17: What do you want for Christmas this year?");
      System.out.println("1. Sunglasses");
      System.out.println("2. PS5");
      System.out.println("3. A Red Ryder Carbine Action 200-shot Range Model air rifle");
      System.out.println("4. New phone");
      System.out.println("5. Baby Yoda Plushie");
      System.out.print("Your Answer: ");
      X[16] = scan.nextInt();
      
      System.out.println("\nQuestion 18: How do you wear your mask during corona?");
      System.out.println("1. Yeah but it's hard to breathe");
      System.out.println("2. Only when I have to");
      System.out.println("3. I never take my mask off at all, even when I shower");
      System.out.println("4. Normally, covering nose and mouth");
      System.out.println("5. This whole virus is a hoax for the government");
      System.out.print("Your Answer: ");
      X[17] = scan.nextInt();

      System.out.println("\nQuestion 19: What's the one thing you would save if a fire started in your house?");
      System.out.println("1. Myself");
      System.out.println("2. Pictures");
      System.out.println("3. The Communist Manifesto");
      System.out.println("4. My phone");
      System.out.println("5. My USB containing all my research on Aliens");
      System.out.print("Your Answer: ");
      X[18] = scan.nextInt();
   
      System.out.println("\nResults...");

      for(int i = 0; i < 19; i++)
      {
         if(X[i] == 1)
            a++;
            
         if(X[i] == 2)
            b++;

         if(X[i] == 3)
            c++;
            
         if(X[i] == 4)
            d++;
            
         if(X[i] == 5)
            e++;
      }
      
      String a_string = "You probably think the mafia did it.";

      String b_string = "You probably think it was an inside job.";

      String c_string = "You probably think it was the Cubans or Soviets.";

      String d_string = "You probably think it was Oswald.";

      String e_string = "You probably think ALIENS.";

      max = a;
      String max_string = a_string;

      if(b > max)
      {
         max = b;
         max_string = b_string;
         a = 100;
      }

      if(c > max)
      {
         max = c;
         max_string = c_string;
         b = 101;
      }

      if(d > max)
      {
         max = d;
         max_string = d_string;
         c = 102;
      }

      if(e > max)
      {
         max = e;
         max_string = e_string;
         d = 103;
      }
      
      if(a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e)
      {
         System.out.println("The quiz says that you believe in more than one JFK conspiracy theory.");
         System.out.println("Here are two theories that you believe in out of all of the theories you could possibly believe in:");
         
         if(a == b)
            System.out.println(a_string + "\n" + b_string);

         else if(a == c)
            System.out.println(a_string + "\n" + c_string);
         
         else if(a == d)
            System.out.println(a_string + "\n" + d_string);
            
         else if(a == e)
            System.out.println(a_string + "\n" + e_string);
            
         else if(b == c)
            System.out.println(b_string + "\n" + c_string);
            
         else if(b == d)
            System.out.println(b_string + "\n" + d_string);
            
         else if(b == e)
            System.out.println(b_string + "\n" + e_string);
         
         else if(c == d)
            System.out.println(c_string + "\n" + d_string);
            
         else if(c == e)
            System.out.println(c_string + "\n" + e_string);
            
         else if(d == e)
            System.out.println(d_string + "\n" + e_string);
            
         else
            System.out.println("Error! Retake the quiz and be more decisive ya walnut.");
      }
      
      else
      {
         System.out.println(max_string);
      }
   }
}