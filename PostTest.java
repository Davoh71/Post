package post;

import java.util.Date;
import java.util.Scanner;

public class PostTest implements PostInter {
    static PostStorage postStorage = new PostStorage();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            PostInter.prinrtComands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADDPOST:
                    addPost();
                    break;
                case SEARCHPOST:
                    searchPost();
                    break;
                case POSTBYCATEGORY:
                    postByCategory();
                    break;
                case ALLPOSTS:
                    postStorage.printAllPosts();
                    break;
                default:
                    System.out.println("Wrong Command!!!");
            }
        }
    }
                ///////////    { 1 }
    public static void addPost() {
        System.out.println("Please input Title Text Category");
        String post = scanner.nextLine();
        String[] postData = post.split(",");
        if (postData.length == 3) {
            String title = postData[0];
            String text = postData[1];
            String category = postData[2];
            Post post1 = new Post(title, text, category, new Date());
            postStorage.add(post1);
            System.out.println("Lesson was added!");
        }else
            System.out.println("Wrong Command!!!");
    }
                /////////////    { 2 }
    public static void searchPost(){
        postStorage.printAllPosts();
        String post = scanner.nextLine();
        Post post1 = postStorage.getByTittle(post);
        if (post1 == null){
            postStorage.searchPostsByKeyword(post);
        }else
            System.out.println(post);
    }
    ///////////////     {   3   }
    public static void postByCategory(){
        postStorage.printAllPosts();
        String post = scanner.nextLine();
        if (post == null){
            System.out.println(post);
        }else
           postStorage.printPostsByCategory(post);
    }
}


