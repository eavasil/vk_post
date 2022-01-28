package domain;

public class VkPost {
    private int id;
    //идентификатор записи
    private int creatorId;
    //автор записи
    private int date;
    //дата публикации поста
    private int textPost;
    //текст поста
    int viewsCount;
    private Media[]medias;

    public int reposts;

    public class CommentsInfo {
        private int count;
        //количество комментов
        private boolean canPost;
        // кто может комментировать запись (пользователи)
        private int canPostGroups;
        // кто может комментирвоать (группы и сообщества)
        private boolean canComments;
    }
    public class Likes {
    private int count;
    //количество лайков
    private int userLikes;
    // наличие отместки мне нравится от текущего пользователя
    private int canRepostPublish;
    // можно ли делать репост
    }

}
