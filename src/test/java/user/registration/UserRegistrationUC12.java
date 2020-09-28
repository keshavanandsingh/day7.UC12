package user.registration;
import org.junit.Test;

import org.junit.Assert;
import java.util.*;

public class UserRegistrationUC12
{
	//@Ignore
		@Test
		public void when_Valid_First_Name_Returns_True() {
			try {
				System.out.println("Enter first name ");
				Scanner s1 = new Scanner(System.in);
				String s2 =s1.nextLine();
				validate v1 = new validate();
				boolean firstName = v1.validateFirstName(s2);
				Assert.assertEquals(true, firstName);
			} catch (ExceptionClass e) {
				e.printStackTrace();
			}
		}
		
		//@Ignore
		@Test
		public void when_Valid_Last_Name_Returns_True() {
			try {
				System.out.println("Enter last name ");
				Scanner s1 = new Scanner(System.in);
				String s2 =s1.nextLine();
				validate v1 = new validate();
				boolean lastName = v1.validateLastName(s2);
				Assert.assertEquals(true, lastName);
			} catch (ExceptionClass e) {
				e.printStackTrace();
			}
		}
		
		//@Ignore
		@Test
		public void when_Valid_Email_Returns_True() {
			try {
				System.out.println("Enter email id ");
				Scanner sc = new Scanner(System.in);
				String s2 =sc.nextLine();
				validate v1 = new validate();
				boolean email = v1.validateEmail(s2);
				Assert.assertEquals(true, email);
			} catch (ExceptionClass e) {
				e.printStackTrace();
			}
		}
		
		//@Ignore
		@Test
		public void when_Valid_Mobile_Number_Returns_True() {
			try {
				System.out.println("Enter mobile number ");
				Scanner s1 = new Scanner(System.in);
				String s2 =s1.nextLine();
				validate v1 = new validate();
				boolean mnumber = v1.validateMobileNumber(s2);
				Assert.assertEquals(true, mnumber);
			} catch (ExceptionClass e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void when_Valid_Password_Returns_True() {
			try {
				System.out.println("Enter password ");
				Scanner s1 = new Scanner(System.in);
				String s2 =s1.nextLine();
				validate v1 = new validate();
				boolean password = v1.validatePassword(s2);
				Assert.assertEquals(true, password);
			} catch (ExceptionClass e) {
				e.printStackTrace();
			}
		}
	
	}


