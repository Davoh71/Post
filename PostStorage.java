package post.storage;

import post.model.Post;

public class PostStorage {

    private Post[] posts = new Post[10];

    private int size = 0;

    public void add(Post post) {
        if (size == posts.length) {
            extend();
        }
        posts[size++] = post;
    }

    private void extend() {
        Post[] tmp = new Post[posts.length * 2];
        System.arraycopy(posts, 0, tmp, 0, posts.length);
        posts = tmp;
    }

    public Post getByTittle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(title))
                System.out.println(posts[i]);
        }
        return null;
    }

    public void searchPostsByKeyword(String keywoed) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getText().contains(keywoed) | posts[i].getTitle().contains(keywoed)) {
                System.out.println(posts[i]);
            } else {
                System.out.println(keywoed + " Chka tpes Titil kam Text");
            }
        }

    }

    public void printAllPosts() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }

    public void printPostsByCategory(String  category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().equals(category)) {
                System.out.println(posts[i]);
            } else {
                System.out.println(category + " Chka tpes Category ");
            }

        }
    }
}
