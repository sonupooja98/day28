package com.day28;


import java.util.Scanner;

public class AddressBookMain {
	Scanner scanner = new Scanner(System.in);
	public void chooseOption()
    {
		AddressBookService addressBookService = new AddressBookService();
        
        boolean isExit = false;
        while (!isExit)
        {
            System.out.print("Enter Number As Per Your Choice:\n1.Add-New Contacts:\n2.Display-All Records:\n3.Edit Contact\n:" +
                    "\n4.Delete Contact\n5.Create a file:\n6.Write into file\n7.Read a file\n8.Exit\n");
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                    //add new contact.
                	addressBookService.addDetails();
                    break;
                case 2:
                    //display all contact.
                	addressBookService.displayContacts();
                    break;
                case 3:
                    //edit existing contact.
                    addressBookService.editContact();
                    break;
                case 4:
                    //delete existing contact.
                    addressBookService.deleteContact();
                    break;
                case 5:
                    //delete existing contact.
                    addressBookService.fileCreate();
                    break;
                case 6:
                    //delete existing contact.
                    addressBookService.fileWrite();
                    break;
                case 7:
                    //delete existing contact.
                    addressBookService.fileReader();
                    break;
                case 8:
                    //Exit from program.
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }

    public static void main(String[] args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.chooseOption();
        
    }


}