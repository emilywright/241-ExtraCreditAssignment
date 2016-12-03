
import java.util.Scanner;
import java.io.*;

public class driver {


  //Main function, where the files are inputed
  public static void main (String[] args) {

    try {

      System.out.print("\nPlease input a text files: ");
      Scanner uInput = new Scanner(System.in);
      // 2010
      String userInput10 = uInput.next();
      File yearFile10 = new File(userInput10);
      Scanner yearScan10 = new Scanner(yearFile10);
      // 2011
      String userInput11 = uInput.next();
      File yearFile11 = new File(userInput11);
      Scanner yearScan11 = new Scanner(yearFile11);
      // 2012
      String userInput12 = uInput.next();
      File yearFile12 = new File(userInput12);
      Scanner yearScan12 = new Scanner(yearFile12);
      // 2013
      String userInput13 = uInput.next();
      File yearFile13 = new File(userInput13);
      Scanner yearScan13 = new Scanner(yearFile13);
      // 2014
      String userInput14 = uInput.next();
      File yearFile14 = new File(userInput14);
      Scanner yearScan14 = new Scanner(yearFile14);

      handleTree(yearScan10, yearScan11, yearScan12, yearScan13, yearScan14);

    } catch (FileNotFoundException e) {

      System.out.println("Please input a valid YOB text files, with the format [name], [gender], [frequency].");
      System.exit(0);

    }
  }

  public static void handleTree(Scanner fileInfo10, Scanner fileInfo11, Scanner fileInfo12, Scanner fileInfo13, Scanner fileInfo14) {

    // All years
    BinarySearchTree maleTree = new BinarySearchTree();
    BinarySearchTree femaleTree = new BinarySearchTree();
    int maleTotal = 0;
    int femaleTotal = 0;
    // 2010
    BinarySearchTree maleTree10 = new BinarySearchTree();
    BinarySearchTree femaleTree10 = new BinarySearchTree();
    int maleTotal10 = 0;
    int femaleTotal10 = 0;
    // 2011
    BinarySearchTree maleTree11 = new BinarySearchTree();
    BinarySearchTree femaleTree11 = new BinarySearchTree();
    int maleTotal11 = 0;
    int femaleTotal11 = 0;
    // 2012
    BinarySearchTree maleTree12 = new BinarySearchTree();
    BinarySearchTree femaleTree12 = new BinarySearchTree();
    int maleTotal12 = 0;
    int femaleTotal12 = 0;
    // 2013
    BinarySearchTree maleTree13 = new BinarySearchTree();
    BinarySearchTree femaleTree13 = new BinarySearchTree();
    int maleTotal13 = 0;
    int femaleTotal13 = 0;
    // 2014
    BinarySearchTree maleTree14 = new BinarySearchTree();
    BinarySearchTree femaleTree14 = new BinarySearchTree();
    int maleTotal14 = 0;
    int femaleTotal14 = 0;

    //This while loads the BST with all necessary nodes..
    //It does this by using the comma as a delimeter and splits the info into an array.
    //It then creates three trees. A female, a male and a mixed. This is done to
    //Simplify later functions that require female and male into be pulled, as it should reduce run time a bit
    //But also simplifies our logic.

    // 2010
    while (fileInfo10.hasNext()) {

      String currLine = fileInfo10.nextLine();
      String[] currLineSplit = currLine.split("\\,");
      if (currLineSplit[1].charAt(0) == 'M' || currLineSplit[1].charAt(0) == 'm') {

        maleTotal10 += Integer.parseInt(currLineSplit[2]);
        maleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(maleTree10, currNode);
        BinarySearchTree.treeInsert(maleTree, currNode2);
      } else {

        femaleTotal10 += Integer.parseInt(currLineSplit[2]);
        femaleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode1 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(femaleTree10, currNode1);
        BinarySearchTree.treeInsert(femaleTree, currNode2);
      }
    }

    // 2011
    while (fileInfo11.hasNext()) {

      String currLine = fileInfo11.nextLine();
      String[] currLineSplit = currLine.split("\\,");
      if (currLineSplit[1].charAt(0) == 'M' || currLineSplit[1].charAt(0) == 'm') {

        maleTotal11 += Integer.parseInt(currLineSplit[2]);
        maleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(maleTree11, currNode);
        BinarySearchTree.treeInsert(maleTree, currNode2);
      } else {

        femaleTotal11 += Integer.parseInt(currLineSplit[2]);
        femaleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(femaleTree11, currNode);
        BinarySearchTree.treeInsert(femaleTree, currNode2);
      }
    }

    // 2012
    while (fileInfo12.hasNext()) {

      String currLine = fileInfo12.nextLine();
      String[] currLineSplit = currLine.split("\\,");
      if (currLineSplit[1].charAt(0) == 'M' || currLineSplit[1].charAt(0) == 'm') {

        maleTotal12 += Integer.parseInt(currLineSplit[2]);
        maleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(maleTree12, currNode);
        BinarySearchTree.treeInsert(maleTree, currNode2);
      } else {

        femaleTotal12 += Integer.parseInt(currLineSplit[2]);
        femaleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(femaleTree12, currNode);
        BinarySearchTree.treeInsert(femaleTree, currNode2);
      }
    }

    // 2013
    while (fileInfo13.hasNext()) {

      String currLine = fileInfo13.nextLine();
      String[] currLineSplit = currLine.split("\\,");
      if (currLineSplit[1].charAt(0) == 'M' || currLineSplit[1].charAt(0) == 'm') {

        maleTotal13 += Integer.parseInt(currLineSplit[2]);
        maleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(maleTree13, currNode);
        BinarySearchTree.treeInsert(maleTree10, currNode2);
      } else {

        femaleTotal13 += Integer.parseInt(currLineSplit[2]);
        femaleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(femaleTree13, currNode);
        BinarySearchTree.treeInsert(femaleTree, currNode2);
      }
    }

    // 2014
    while (fileInfo14.hasNext()) {

      String currLine = fileInfo14.nextLine();
      String[] currLineSplit = currLine.split("\\,");
      if (currLineSplit[1].charAt(0) == 'M' || currLineSplit[1].charAt(0) == 'm') {

        maleTotal14 += Integer.parseInt(currLineSplit[2]);
        maleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(maleTree14, currNode);
        BinarySearchTree.treeInsert(maleTree, currNode2);
      } else {

        femaleTotal14 += Integer.parseInt(currLineSplit[2]);
        femaleTotal += Integer.parseInt(currLineSplit[2]);
        node currNode = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        node currNode2 = new node(currLineSplit[0], Integer.parseInt(currLineSplit[2]), currLineSplit[1].charAt(0));
        BinarySearchTree.treeInsert(femaleTree14, currNode);
        BinarySearchTree.treeInsert(femaleTree, currNode2);
      }
    }

    TrendyNames(maleTree10, femaleTree10, maleTree11, femaleTree11, maleTree12, femaleTree12, maleTree13, femaleTree13, maleTree14, femaleTree14,
    maleTotal10, femaleTotal10, maleTotal11, femaleTotal11, maleTotal12, femaleTotal12, maleTotal13, femaleTotal13, maleTotal14, femaleTotal14,
    femaleTree, maleTree, femaleTotal, maleTotal);

  }

  public static void TrendyNames(BinarySearchTree maleTree10, BinarySearchTree femaleTree10, BinarySearchTree maleTree11, BinarySearchTree femaleTree11,
  BinarySearchTree maleTree12, BinarySearchTree femaleTree12, BinarySearchTree maleTree13, BinarySearchTree femaleTree13, BinarySearchTree maleTree14,
  BinarySearchTree femaleTree14, int maleTotal10, int femaleTotal10, int maleTotal11, int femaleTotal11, int maleTotal12, int femaleTotal12,
  int maleTotal13, int femaleTotal13, int maleTotal14, int femaleTotal14, BinarySearchTree femaleTree, BinarySearchTree maleTree,
  int femaleTotal, int maleTotal) {

    System.out.println("in");
    //2010
    //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
      node[] femArr10 = BinarySearchTree.MostPopularName(femaleTree10.root);
      node[] malArr10 = BinarySearchTree.MostPopularName(maleTree10.root);
      System.out.println("\n2010: ");
      System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

      //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
      for (int i = 0; i < femArr10.length; i++) {
        //Female names from here down
        System.out.print("\n" + femArr10[i].name);
        for (int o = 0; o < 14 - femArr10[i].name.length(); o++){
          System.out.print(" ");
        }
        System.out.print(femArr10[i].occur);
        for (int o = 0; o < 14 - String.valueOf(femArr10[i].occur).length(); o++){
          System.out.print(" ");
        }
        System.out.printf("%.7f", (float)femArr10[i].occur / (float)femaleTotal10 * 100);
        System.out.print("%");
        for (int o = 0; o < 4; o++){
          System.out.print(" ");
        }

        //Male names from here down
        System.out.print(malArr10[i].name);
        for (int o = 0; o < 14 - malArr10[i].name.length(); o++){
          System.out.print(" ");
        }
        System.out.print(malArr10[i].occur);
        for (int o = 0; o < 14 - String.valueOf(malArr10[i].occur).length(); o++){
          System.out.print(" ");
        }
        System.out.printf("%.7f", (float)malArr10[i].occur / (float)maleTotal10 * 100);
        System.out.print("%");
      }

      //2011
      //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
        node[] femArr11 = BinarySearchTree.MostPopularName(femaleTree11.root);
        node[] malArr11 = BinarySearchTree.MostPopularName(maleTree11.root);
        System.out.println("\n\n2011: ");
        System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

        //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
        for (int i = 0; i < femArr11.length; i++) {
          //Female names from here down
          System.out.print("\n" + femArr11[i].name);
          for (int o = 0; o < 14 - femArr11[i].name.length(); o++){
            System.out.print(" ");
          }
          System.out.print(femArr11[i].occur);
          for (int o = 0; o < 14 - String.valueOf(femArr11[i].occur).length(); o++){
            System.out.print(" ");
          }
          System.out.printf("%.7f", (float)femArr11[i].occur / (float)femaleTotal11 * 100);
          System.out.print("%");
          for (int o = 0; o < 4; o++){
            System.out.print(" ");
          }

          //Male names from here down
          System.out.print(malArr11[i].name);
          for (int o = 0; o < 14 - malArr11[i].name.length(); o++){
            System.out.print(" ");
          }
          System.out.print(malArr11[i].occur);
          for (int o = 0; o < 14 - String.valueOf(malArr11[i].occur).length(); o++){
            System.out.print(" ");
          }
          System.out.printf("%.7f", (float)malArr11[i].occur / (float)maleTotal11 * 100);
          System.out.print("%");
        }

        //2012
        //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
          node[] femArr12 = BinarySearchTree.MostPopularName(femaleTree12.root);
          node[] malArr12 = BinarySearchTree.MostPopularName(maleTree12.root);
          System.out.println("\n\n2012: ");
          System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

          //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
          for (int i = 0; i < femArr12.length; i++) {
            //Female names from here down
            System.out.print("\n" + femArr12[i].name);
            for (int o = 0; o < 14 - femArr12[i].name.length(); o++){
              System.out.print(" ");
            }
            System.out.print(femArr12[i].occur);
            for (int o = 0; o < 14 - String.valueOf(femArr12[i].occur).length(); o++){
              System.out.print(" ");
            }
            System.out.printf("%.7f", (float)femArr12[i].occur / (float)femaleTotal12 * 100);
            System.out.print("%");
            for (int o = 0; o < 4; o++){
              System.out.print(" ");
            }

            //Male names from here down
            System.out.print(malArr12[i].name);
            for (int o = 0; o < 14 - malArr12[i].name.length(); o++){
              System.out.print(" ");
            }
            System.out.print(malArr12[i].occur);
            for (int o = 0; o < 14 - String.valueOf(malArr12[i].occur).length(); o++){
              System.out.print(" ");
            }
            System.out.printf("%.7f", (float)malArr12[i].occur / (float)maleTotal12 * 100);
            System.out.print("%");
          }

          //2013
          //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
            node[] femArr13 = BinarySearchTree.MostPopularName(femaleTree13.root);
            node[] malArr13 = BinarySearchTree.MostPopularName(maleTree13.root);
            System.out.println("\n\n2013: ");
            System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

            //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
            for (int i = 0; i < femArr13.length; i++) {
              //Female names from here down
              System.out.print("\n" + femArr13[i].name);
              for (int o = 0; o < 14 - femArr13[i].name.length(); o++){
                System.out.print(" ");
              }
              System.out.print(femArr13[i].occur);
              for (int o = 0; o < 14 - String.valueOf(femArr13[i].occur).length(); o++){
                System.out.print(" ");
              }
              System.out.printf("%.7f", (float)femArr13[i].occur / (float)femaleTotal13 * 100);
              System.out.print("%");
              for (int o = 0; o < 4; o++){
                System.out.print(" ");
              }

              //Male names from here down
              System.out.print(malArr13[i].name);
              for (int o = 0; o < 14 - malArr13[i].name.length(); o++){
                System.out.print(" ");
              }
              System.out.print(malArr13[i].occur);
              for (int o = 0; o < 14 - String.valueOf(malArr13[i].occur).length(); o++){
                System.out.print(" ");
              }
              System.out.printf("%.7f", (float)malArr13[i].occur / (float)maleTotal13 * 100);
              System.out.print("%");
            }

            //2010
            //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
              node[] femArr14 = BinarySearchTree.MostPopularName(femaleTree14.root);
              node[] malArr14 = BinarySearchTree.MostPopularName(maleTree14.root);
              System.out.println("\n\n2014: ");
              System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

              //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
              for (int i = 0; i < femArr14.length; i++) {
                //Female names from here down
                System.out.print("\n" + femArr14[i].name);
                for (int o = 0; o < 14 - femArr14[i].name.length(); o++){
                  System.out.print(" ");
                }
                System.out.print(femArr14[i].occur);
                for (int o = 0; o < 14 - String.valueOf(femArr14[i].occur).length(); o++){
                  System.out.print(" ");
                }
                System.out.printf("%.7f", (float)femArr14[i].occur / (float)femaleTotal14 * 100);
                System.out.print("%");
                for (int o = 0; o < 4; o++){
                  System.out.print(" ");
                }

                //Male names from here down
                System.out.print(malArr14[i].name);
                for (int o = 0; o < 14 - malArr14[i].name.length(); o++){
                  System.out.print(" ");
                }
                System.out.print(malArr14[i].occur);
                for (int o = 0; o < 14 - String.valueOf(malArr14[i].occur).length(); o++){
                  System.out.print(" ");
                }
                System.out.printf("%.7f", (float)malArr14[i].occur / (float)maleTotal14 * 100);
                System.out.print("%");
              }

              // All years
              //This function returns the top occurences in an array of size 5. So we init two seperate arrays since we need female and male info.
                node[] femArr = BinarySearchTree.MostPopularName(femaleTree.root);
                node[] malArr = BinarySearchTree.MostPopularName(maleTree.root);
                System.out.println("\n\nAll years: ");
                System.out.println("Female name:  " + "Frequency:    " + "Percentage:   " + "Male name:    " + "Frequency:    " + "Percentage:   ");

                //Again all for statements are just used to ensure formatting is pretty, it's less confusing than it looks.
                for (int i = 0; i < femArr.length; i++) {
                  //Female names from here down
                  System.out.print("\n" + femArr[i].name);
                  for (int o = 0; o < 14 - femArr[i].name.length(); o++){
                    System.out.print(" ");
                  }
                  System.out.print(femArr[i].occur);
                  for (int o = 0; o < 14 - String.valueOf(femArr[i].occur).length(); o++){
                    System.out.print(" ");
                  }
                  System.out.printf("%.7f", (float)femArr[i].occur / (float)femaleTotal * 100);
                  System.out.print("%");
                  for (int o = 0; o < 4; o++){
                    System.out.print(" ");
                  }

                  //Male names from here down
                  System.out.print(malArr[i].name);
                  for (int o = 0; o < 14 - malArr[i].name.length(); o++){
                    System.out.print(" ");
                  }
                  System.out.print(malArr[i].occur);
                  for (int o = 0; o < 14 - String.valueOf(malArr[i].occur).length(); o++){
                    System.out.print(" ");
                  }
                  System.out.printf("%.7f", (float)malArr[i].occur / (float)maleTotal * 100);
                  System.out.print("%");
                }
              System.out.println();

  }

}
