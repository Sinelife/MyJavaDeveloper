package _2_java_essential.homework01.ex1;

class Contact {
    private String phone;
    private String email;

    Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "contacts(" + phone + ", " + email + ")";
    }
}
