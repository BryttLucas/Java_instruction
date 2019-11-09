import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Contact.Contact;

public class Ch22LambdaDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Lambda / Stream Demo App\n");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, " 555.555.5555"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		List<Contact> contactsWithoutPhone = contactsNoPhone(contacts);
		for (Contact c : contactsWithoutPhone) {
			System.out.println(c.getName());

		}
		List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone() == null);

		for (Contact c : contactsNoPhone) {
			System.out.println(c.getName());
		}
		List<Contact> contactsNoEmail = filterContacts(contacts, c -> c.getEmail() == null);
		for (Contact c : contactsNoEmail) {
			System.out.println(c.getName());
		}

		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		List<String> contactPhoneNumbers = transfromContacts(contacts, c-> {
			String phone = c.getPhone() == null ? "n/a": c.getPhone();
			return c.getName()+ ": " + phone;
		});
			for(String phoneNumber : contactPhoneNumbers) {
				System.out.println(phoneNumber);
			}
		 processContacts2(contacts, c-> c.getPhone() == null,
				                   c-> c.getName().toLowerCase(),
				                   str -> System.out.println(str));
	    }

   private static List<Contact> contactsNoPhone(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);

			}
		}
		return contactsWithoutPhone;
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);

			}
		}
		return filteredContacts;

	}

	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c : contacts) {
			consumer.accept(c);

		}
	}
	private static List<String> transfromContacts(List<Contact> contacts, Function<Contact, String> fuction){
		List<String> strings = new ArrayList<>();
		
			for(Contact c: contacts) {
				String string = fuction.apply(c);
				strings.add(string);
				
			}
			return strings;
	}
	private static void processContacts2(List<Contact> contacts, 
			Predicate<Contact> condition, Function< Contact, String> function, Consumer<String> consumer) {
		
		for(Contact c : contacts ) {
			if (condition.test(c)) {
				String s = function.apply(c);
				consumer.accept(s);		
			}
		}	
	}
}