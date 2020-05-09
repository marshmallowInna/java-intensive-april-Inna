package lesson5;

    public class Customer extends User5 {

        private String login;
        private String password;


        public Customer() {
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Customer(int id, String name, String login, String password) {
            super(id, name);
            this.login = login;
            this.password = password;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    "} " + super.toString();
        }

        @Override
        public void action() {
            System.out.println("action customer");
        }
    }










