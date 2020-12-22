package post;


import java.util.Date;

public class Post {
    String title;
    String text;
    String category;
    Date createdDate;

 public Post (String title, String text,String category, Date createdDate){
        this.title = title;
        this.text = text;
        this.category = category;
        this.createdDate = createdDate;
 }
 public Post(){

 }
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
    public String getCategory(){
     return category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (title != null ? !title.equals(post.title) : post.title != null) return false;
        if (text != null ? !text.equals(post.text) : post.text != null) return false;
        if (category != null ? !category.equals(post.category) : post.category != null) return false;
        return createdDate != null ? createdDate.equals(post.createdDate) : post.createdDate == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
