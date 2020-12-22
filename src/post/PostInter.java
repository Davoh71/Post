package post;

public interface PostInter {
    int EXIT = 0;
    int ADDPOST = 1;
    int SEARCHPOST = 2;
    int POSTBYCATEGORY = 3;
    int ALLPOSTS = 4;

   static void prinrtComands(){
       System.out.println("EXIT : " + EXIT);
       System.out.println("Title Text : " + ADDPOST);
       System.out.println("Search Post : " + SEARCHPOST);
       System.out.println("Post by category : " + POSTBYCATEGORY);
       System.out.println("All Post : " + ALLPOSTS);
    }
}
