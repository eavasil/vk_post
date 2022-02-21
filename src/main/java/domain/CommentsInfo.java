package domain;

public class CommentsInfo {
        private int count;
        //количество комментов
        private int canPost;
        // кто может комментировать запись (пользователи)
        private int canPostGroups;
        // кто может комментирвоать (группы и сообщества)
        private int canComments;

        public int getCount() {
                return count;
        }

        public void setCount(int count) {
                this.count = count;
        }

        public int getCanPost() {
                return canPost;
        }

        public void setCanPost(int canPost) {
                this.canPost = canPost;
        }

        public int getCanPostGroups() {
                return canPostGroups;
        }

        public void setCanPostGroups(int canPostGroups) {
                this.canPostGroups = canPostGroups;
        }

        public int getCanComments() {
                return canComments;
        }

        public void setCanComments(int canComments) {
                this.canComments = canComments;
        }
}

