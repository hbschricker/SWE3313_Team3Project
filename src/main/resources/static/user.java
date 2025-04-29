import java.util.ArrayList;
import java.util.List;

    public class user {
        private String username;
        private String email;
        private String status;


        /**
         * takes in information about the user and assigns it to the attributes
         * @param username
         * @param email
         * @param status
         */
        public user(String username, String email, String status) {
            this.username = username;
            this.email = email;
            this.status = status;
        }


        /**
         * gets the value of the private attribute and returns it
         * @return
         */
        public String getUsername() {
            return username;
        }


        /**
         * gets the value of the private attribute and returns it
         * @return
         */
        public String getEmail() {
            return email;
        }


        /**
         * gets the value of the private attribute and returns it
         * @return
         */
        public String getStatus() {
            return status;
        }


        /**
         * gets the value of the private attribute and returns it
         * @param status
         */
        public void setStatus(String status) {
            this.status = status;
        }
    }
