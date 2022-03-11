package com.locker.me;

import java.io.IOException;
import java.util.Scanner;

public class LockerMePvtLtd
{
  public static void main(String[] args)
    throws IOException
  {
    int ch = 0;int choice = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\t**************************\n");
    System.out.println("\t Welcome to LOCK IT! ");
    System.out.println("\t By, Locker Pvt Ltd. \n");
    System.out.println("\t**************************");
    System.out.println(" Developer\t: Yogesh Devake \n Company\t: EXFO \n");
    for (;;)
    {
      System.out.println("Please choose one of the following options :");
      System.out.println("1. List Current Files");
      System.out.println("2. Business Operations");
      System.out.println("3. Close Application");
      try
      {
        ch = sc.nextInt();
      }
      catch (Exception e)
      {
        System.out.println("Null Exception occurred");
      }
      switch (ch)
      {
      case 1: 
        BusinessOperation.listFiles();
        break;
      case 2: 
        System.out.println("Please choose one of the following options :");
        System.out.println("1. Add a File");
        System.out.println("2. Delete a File");
        System.out.println("3. Search for a File");
        try
        {
          choice = sc.nextInt();
        }
        catch (Exception e)
        {
          System.out.println("Null Exception occurred");
        }
        switch (choice)
        {
        case 1: 
          System.out.println("Input the name of a file to be created: ");
          String fileCreate = sc.next();
          
          BusinessOperation.createFile(fileCreate);
          break;
        case 2: 
          System.out.print("Input the name of a file to be deleted: ");
          String fileDelete = sc.next();
          
          BusinessOperation.deleteFile(fileDelete);
          break;
        case 3: 
          System.out.println("Input the name of a file to be searched: ");
          String fileSearch = sc.next();
          
          BusinessOperation.searchFile(fileSearch);
          break;
        default: 
          System.out.println("\n Opps! Invalid Input,Re-do the process\n");
        }
        break;
      case 3: 
        sc.close();
        System.out.println("\n Nice to see you. Good bye...");
        System.exit(1);
        break;
      default: 
        System.out.println("\n\n Opps! Invalid Input, Select within the range of 1-3\n");
      }
    }
  }
}
