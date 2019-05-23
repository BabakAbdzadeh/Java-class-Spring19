public class Registration {

        private String fullName;
        private int birthDay;
        public Registration(String f,int b){
            this.fullName = f;
            this.birthDay = b;
            String registrationCode = fullName + birthDay;
            System.out.println(registrationCode);

        }
}
