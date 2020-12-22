package post;

public interface PostInter {
    String EXIT = "0";
    String ADDPOST = "1";
    String SEARCHPOST = "2";
    String POSTBYCATEGORY = "3";
    String ALLPOSTS = "4";

   static void prinrtComands(){
       System.out.println("EXIT : " + EXIT);
       System.out.println("Title Text : " + ADDPOST);
       System.out.println("Search Post : " + SEARCHPOST);
       System.out.println("Post by category : " + POSTBYCATEGORY);
       System.out.println("All Post : " + ALLPOSTS);
    }
}
