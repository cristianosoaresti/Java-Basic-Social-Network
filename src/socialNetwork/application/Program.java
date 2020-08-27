package socialNetwork.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import socialNetwork.entities.Comment;
import socialNetwork.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Post post1 = new Post(sdf.parse("21/06/2018 10:30:23"), "Traveling around the world", "I am going to do that one day soon!", 45);
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		post1.addComments(c1);
		post1.addComments(c2);
		System.out.println(post1.toString());
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:15"), "Goog night guys", "See you tomorrow", 5);
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("Bye. Take care");
		post2.addComments(c3);
		post2.addComments(c4);
		System.out.println(post2.toString());
	}

}
