package model;

public class RequestBody {

        private String title;
        private String body;
        private int userId;

        // Getter for title
        public String getTitle() {
            return title;
        }

        // Setter for title
        public void setTitle(String title) {
            this.title = title;
        }

        // Getter for body
        public String getBody() {
            return body;
        }

        // Setter for body
        public void setBody(String body) {
            this.body = body;
        }

        // Getter for userId
        public int getUserId() {
            return userId;
        }

        // Setter for userId
        public void setUserId(int userId) {
            this.userId = userId;
        }
}
