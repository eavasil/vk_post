package domain;

public class LikesInfo {
    private int count;
    //количество лайков
    private int userLikes;
    // наличие отместки мне нравится от текущего пользователя
    private int canRepostPublish;
    // можно ли делать репост


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanRepostPublish() {
        return canRepostPublish;
    }

    public void setCanRepostPublish(int canRepostPublish) {
        this.canRepostPublish = canRepostPublish;
    }
}
